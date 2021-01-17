pushd ~/ITMO-Psychopass-Team/tests
    ./build.sh
    ./make_test_settings.sh
popd


MONGO_POD=`kubectl get pods -ncivilla-stage --no-headers -o custom-columns=":metadata.name" | grep mongodb-`
kubectl port-forward $MONGO_POD -ncivilla-stage --address='0.0.0.0' 27017:27017 > /dev/null &
KUBECTL_MONGO_FWD_PID=$!

POD=`kubectl get pods -ncivilla-stage --no-headers -o custom-columns=":metadata.name" | grep analysisserver-`
kubectl port-forward $POD -ncivilla-stage --address='0.0.0.0' 80:8051 > /dev/null &
KUBECTL_ANALYSIS_FWD_PID=$!

KUBE_PROXY=`kubectl proxy --context microk8s --address='0.0.0.0' --port=8002 --accept-hosts='.*'`
KUBE_PROXT_PID=$!


docker run -v ~/ITMO-Psychopass-Team/tests:/src \
           --network="host" \
      	   civilladev/acceptance-tests \
           bash -c "cd /src && python -m pytest /src/tests -vv $@"


kill $KUBECTL_MONGO_FWD_PID
kill $KUBECTL_ANALYSIS_FWD_PID
kill $KUBE_PROXT_PID
