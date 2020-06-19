# Use Case Speciﬁcation (Описание прецедента)  
  
## 1. Use-Case Name (Регистрация гражданина)
*[Укажите название прецедента.]*  

Выбор меры пресечения

## 2. Actors (Акторы)
*[Укажите основное действующее лицо прецедента и дополнительных (если они есть)]*

Система Сивилла создаёт систему Психо-паспортов и управляет оружием, названым «Доминатор». Работая бок о бок с правительством, они регулируют преступность в Японии. Сивилла основала Бюро общественной безопасности. Она руководит Инспекторами и страной в целом. На данный момент Япония — единственная страна в мире, использующая эту систему.
  
### 2.1 Brief Description (Краткое описание)
*[Кратко опишите прецедент, с чего он начинается.]*
  
Система, обрабатывающая поступающие данные, выносящая результирующее число в Психопаспорт. Интегральная характеристика (выраженная в виде числа или отображённая соответствующим цветом), определяемая с помощью приборов по мозговым волнам человека, характеризует психическое состояние, личность и вероятность того, что человек будет совершать преступления.
  
## 3. Flow of Events (Последовательность событий)

Сивилла непрестанно оценивает коэффициент преступности — величину, которая показывает, насколько велика вероятность совершения преступления тем или иным человеком. Все данные о эмоциональном состоянии человека и коэффициенте преступности хранятся в его Психопаспорте — специальной характеристике, определяющей положение человека в обществе. Чем светлее психопаспорт, тем безопаснее и пригоднее человек, а вот людям с темным психопаспортом необходимо пройти специальную терапию, или они будут уничтожены.

### 3.1 Basic Flow (Главная последовательность)
*[Опишите последовательность шагов, которые выполняет пользователь. Описание должно быть максимально абстрактным, без привязки к элементам интерфейса и вводу определенных данных.]*  

1) Гражданин соглашается на сбор и обработку его личный, биометрических и прочих данных.
2) Гражданин заполняет специальную форму о себе. Фамиля и имя.
3) Система Civilla собирает, обрабатывает и анализирует поступающие данные гражданина.
4) Система выносит результирующее число, коэффициент преступности(рандомное число) в Психопаспорт.
5) Система Civilla выносит окончательное решение, руководствуясь коэффициентом преступности и предостовляет доступ оружию Доминатор. 
6) Система управления полицией используют обработанные данные полученные от системы Civilla.
7) Система управления полицией реагирует на высокий коэффициент преступности гражданина, записанный в Психопаспорт.
8) Система управления получает или не получает доступ к оружию Доминатор для защиты своих граждан.

## 4. Preconditions (Предусловия)
*[Укажите условия, которые должны выполняться, чтобы прецедент начался.]*

1)	Гражданин соглашается на сбор и обработку его личный, биометрических и прочих данных.

## 5. Postconditions (Постусловия)  
*[Укажите, что изменится в системе после выполнения прецедента.]*

* Система Civilla передаёт данные психопаспортов граждан системе управления полицией, а те реагируют на преступность.  

## 6. Extension Points (Точки расширения)
*[Если прецедент содержит вложенные прецеденты, которые добавляют к нему новые шаги, укажите здесь ссылку на них, на каком шаге главной последовательности они включаются.]*

 [Use-Case Name (Оперативное реагирование на место преступление)](https://github.com/FF220v/ITMO-Psychopass-Team/blob/use-case_1/docs/use-case_1.md)  
 
## 7. Use-case diagram (Диаграмма прецедента)
*<UML диаграмма данного прецедента>* 
![Диаграмма прецедента)](https://github.com/FF220v/ITMO-Psychopass-Team/blob/use-case_3/docs/Diagram%20use-case_3.png)  

## 8. Interface example (Пример интерефейса)
*<Макет пользовательского интерфейса, который будет использоваться для выполнения прецедента>*
![UI3)](https://github.com/FF220v/ITMO-Psychopass-Team/blob/use-case_3/docs/UI3.png)  