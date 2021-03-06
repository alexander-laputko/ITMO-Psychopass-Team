# Vision (Концепция)

## 1. Introduction (Введение)
*[Целью данного документа является сбор, анализ и определение требований к разрабатываемой системе, в нём описываются потребности заинтересованных лиц и потенциальных пользователей продукта, а также причины возникновения данных потребностей.
Введение представляет собой обзор на весь документ в целом и включает в себя следующие разделы - назначение, область применения, определения и аббревиатуры, ссылки и обзор.]*

  Мир будущего почти полностью автоматизирован. Дроны, «умный костюм», личные электронные секретари и дома с функцией смены обстановки — неотъемлемая часть повседневной жизни. Принятие всех важнейших решений, устройство своего будущего и обеспечение безопасности в обществе люди доверили системе под названием «Сивилла», которая определяет способности и психическое состояние любого человека, а также его коэффициент преступности — величина, связанная с вероятностью, с которой этот человек может совершить преступление. Все данные отображаются в специальной характеристике, «Психопаспорте», определяющей положение человека в обществе.
  Те, чей Коэффициент Преступности превышает допустимую норму, должны пройти принудительное лечение или — если Коэффициент зашкаливает — подлежат уничтожению. Раскрытием преступлений и ловлей потенциальных преступников занимаются специальные команды из Бюро Общественной Безопасности.

### 1.1 Purpose (Назначение)
*[Укажите назначение данного документа.]*

  Целью этого документа является сбор, анализ и определение потребностей и функций системы «Сивилла». Основное внимание уделяется возможностям, которые необходимы заинтересованным сторонам и целевым пользователям. Подробная информация о том, как система «Сивилла» отвечает этим требованиям, подробно описана в сценарии использования и дополнительные характеристики.

### 1.2 Scope (Область применения)  
*[Приведите краткое описание области применения данного документа, к какому(им) проекту(ам) он относится, кто им будет пользоваться и т.д.]*

  Замена устаревшего государственного аппарата многофункциональной системой под названием «Сивилла», на которую люди возложат ответственность за сохранение порядка и обеспечение безопасности в обществе. Введение безотказной системы с неограниченными правами поспособствует снижению преступности почти до нуля. На основе данных «психопаспорта» — уникальной характеристики личности — система мгновенно определит индивидуальный коэффициент преступности — вероятность, с которой человек может совершить преступление, указанная в числовом значении — и, если коэффициент превышает норму, беспристрастно судит его как потенциального преступника.
  
### 1.3 Definitions, Acronyms, and Abbreviations (Определения и аббревиатуры)
*[Укажите значение терминов и аббревиатур, которые употребляются в данном документе. Возможно указание ссылки на Глоссарий проекта.]*  

**«Психопаспорт»** — интегральная характеристика (выраженная в виде числа или отображённая соответствующим цветом), определяемая с помощью приборов по мозговым волнам человека, характеризует психическое состояние, личность и вероятность того, что человек будет совершать преступления.  
**«Сивилла»** — система, обрабатывающая поступающие данные, выносящая результирующее число в Психопаспорт. Также данная система выносит окончательное решение о допустимых мерах воздействия на преступника в случае его задержания, руководствуясь коэффициентом преступности и непосредственно переводящая Доминатор из одного режима в другой.  
**Коэффициент преступности** — вероятность того, что гражданин совершил преступления или склонен их совершить, которая определяется уровнями стресса гражданина и другими биологическими параметрами. Те, чьи коэффициенты преступления были в прошлом на определённом уровне, идентифицируются как латентные преступники.  
**«Доминатор»** — высокотехнологичное оружие, используемое полицейскими инспекторами и их подопечными, которое может быть использовано только зарегистрированным лицом и имеет постоянную связь с Сивиллой. Когда наводится на человека, встроенный сканер считывает его коэффициент преступления и переключает состояние оружия на соответствующее ему. По умолчанию, это неактивный режим, чтобы избежать стрельбы по невинным людям.   

### 1.4 References (Ссылки)
*[Перечислите списком названия документов, на которые ссылаетесь в данном, укажите их источники.]*

[Официальный сайт Psycho-Pass](https://psycho-pass.com)  
[Psycho-Pass WiKi](https://psychopass.fandom.com/wiki/Psycho-Pass_Wiki)

### 1.5 Overview (Обзор документа)
*[Укажите краткое описание остальных разделов документа.]*    

## 2. Positioning  (Позиционирование)

### 2.1 Business Opportunity (Возможности для бизнеса)
*[Кратко опишите, какую бизнес-задачу решает проект.]*  
  
Проект решает ряд задач:
* Оптимизирует управление правохранительными органами путем автоматизации.
* Решает проблему этичной, непредвзятой проверки граждан на способность совершать преступления.  
Как следствие, соотношение цена/качество для правохранительных органах улучшается. Проект экономит средства/улучшает благосостояние в регионе, где он развернут.  

### 2.2 Problem Statement (Постановка задачи)
*[Опишите, как именно ваш проект решает проблемы различных групп пользователей. Воспользуетесь таблицей ниже.]*  
### Проблема 1  
<table><tr><td>
  
**The problem of (Проблема)** 
</td><td>

*[Опишите проблему]*  

У правительства и муниципальных управлений нет унифицированного цифрового механизма для борьбы с преступностью, который объединял бы все аспекты полицейского дела.
</td></tr><tr><td>
  
**Affects (Влияет на)**
</td><td>
  
*[Группа лиц, заинтересованных в решении проблемы]*  
* Министерство внутренних дел.
* Муниципальные органы общественного порядка.
* Граждане страны/жители городов.
* Equilibrium inc.
* Конкуренты Equilibrium inc.
</td></tr><tr><td>
  
**The impact of which is (В результате чего)** 
</td><td>

*[Как проблема воздействует на заинтересованных лиц]*  

Как следствие перечисленных выше проблем, при высоких затратах на содержание органов общественного порядка, эффективность их работы всё ещё может быть существенно улучшена. Equilibrium inc. (наша компания), как я её конкуренты могут извлечь прибыль, решая эту проблему. 
</td></tr><tr><td>
  
**A successful solution would be (Решением этого является)**
</td><td>

*[Что может решить проблему в рамках проекта]*  

Решением может стать внедрение унифицированной цифровой системы для управления министерствами, управляющими общественным порядком.
</td></tr>
</table>  

### Проблема 2    
<table><tr><td>
  
**The problem of (Проблема)** 
</td><td>

*[Опишите проблему]*  

Накладные расходы на бюрократию и межведомственное взаимодействие могут и должны быть снижены.
</td></tr><tr><td>
  
**Affects (Влияет на)**
</td><td>
  
*[Группа лиц, заинтересованных в решении проблемы]*  
* Министерство внутренних дел.
* Муниципальные органы общественного порядка.
* Граждане страны/жители городов.
</td></tr><tr><td>
  
**The impact of which is (В результате чего)** 
</td><td>

*[Как проблема воздействует на заинтересованных лиц]*  

Улучшается эффективность работы органов общественного порядка
</td></tr><tr><td>
  
**A successful solution would be (Решением этого является)**
</td><td>

*[Что может решить проблему в рамках проекта]*  

Решением может стать внедрение унифицированной цифровой системы для управления министерствами, управляющими общественным порядком.
</td></tr>
</table>  

### Проблема 3   
<table><tr><td>
  
**The problem of (Проблема)** 
</td><td>

*[Опишите проблему]*  

Соотношение цена/качество городской полиции должно быть улучшено.
</td></tr><tr><td>
  
**Affects (Влияет на)**
</td><td>
  
*[Группа лиц, заинтересованных в решении проблемы]*  
* Министерство внутренних дел.
* Муниципальные органы общественного порядка.
* Граждане страны/жители городов.
</td></tr><tr><td>
  
**The impact of which is (В результате чего)** 
</td><td>

*[Как проблема воздействует на заинтересованных лиц]*  

Как следствие перечисленных выше проблем, при высоких затратах на содержание органов общественного порядка, эффективность их работы всё ещё может быть существенно улучшена.
</td></tr><tr><td>
  
**A successful solution would be (Решением этого является)**
</td><td>

*[Что может решить проблему в рамках проекта]*  

Решением может стать внедрение унифицированной цифровой системы для управления министерствами, управляющими общественным порядком.
</td></tr>
</table>

### 2.3 Product Position Statement (Позиция продукта на рынке)
*[Опишите уникальные особенности проекта, которые отличают его от аналогов на рынке.]*

<table><tr><td>
  
**For (Для)** 
</td><td>

Управления органами порядка
</td></tr><tr><td>
  
**Who (Которые)**
</td><td>
  
*[Описание потребности в решении какой-либо задачи]*  

* Хотят автоматизировать рутиные задачи и оптимизировать управление полицией.

</td></tr><tr><td>
  
**The (product name)**  
**(<Название продукта>)** 
</td><td>

*[является <Категория продукта>]*  

</td></tr><tr><td>
  
**That(Который)**
</td><td>

*[Описание ключевого функционала - причины покупки разрабатываемого продукта]*   
  
* Предоставляет сервис управления полицией, работающий на основании средних коэфициентов преступности в различных районах города.

</td></tr><tr><td>
  
**Unlike(В отличие от)** 
</td><td>

*[Название и характеристики продуктов-конкурентов]*  

Skynet - Автоматическая система управления обороной страны, где искусственный интеллект руководствуется собственной логикой и не поддается контролю.

</td></tr><tr><td>
  
**Our product(Наш продукт)** 
</td><td>

*[Отличительная особенность разрабатываемого продукта]*  

Наша система абсолютно безопасна.

</td></tr>
</table>  
  

<table><tr><td>
  
**For (Для)** 
</td><td>

Управления органами порядка
</td></tr><tr><td>
  
**Who (Которые)**
</td><td>
  
*[Описание потребности в решении какой-либо задачи]*  

Хотят этично, непредвзято проверять граждан на способность совершать преступления.

</td></tr><tr><td>
  
**The (product name)**  
**(<Название продукта>)** 
</td><td>

*[является <Категория продукта>]*  

</td></tr><tr><td>
  
**That(Который)**
</td><td>

*[Описание ключевого функционала - причины покупки разрабатываемого продукта]*   
  
* Система на базе искусственного интеллекта непредвзято оценивает способность совершать преступления у граждан.

</td></tr><tr><td>
  
**Unlike(В отличие от)** 
</td><td>

*[Название и характеристики продуктов-конкурентов]*  

Matrix - использует ИИ и порабощает человечество.

</td></tr><tr><td>
  
**Our product(Наш продукт)** 
</td><td>

*[Отличительная особенность разрабатываемого продукта]*  

Действует только во благо человечества.

</td></tr>
</table>  

## 3. Stakeholder and User Descriptions (Описание заинтересованных лиц)

*[Для того чтобы эффективно решать задачи пользователей, необходимо правильно их определить и вовлечь в процесс сбора требований. В данном разделе дается описание заинтересованных лиц и пользователей проекта, а также описание проблем, которые они хотят решить с помощью разрабатываемого продукта. Здесь не описываются конкретные требования этих людей, но скорее причины, почему данные требования возникли.]*

### 3.1 Market Demographics (Демография рынка)

*[Опишите в общих чертах ситуацию на предполагаемом рынке сбыта продукта, оцените его размер и рост числа потенциальных пользователей. Опишите основные тенденции в использовании технологий. Ответьте на следующие важные вопросы]* 

*[Какова репутация вашей компании на данном рынке?]*

Компания Equilibrium inc. обладает превосходной репутацией компании, создающей оборудования для воцарения антиутопии в тоталитарных государствах.

*[Какую репутацию вы бы хотели приобрести?]*

С продуктом Civilla компания планирует выйти на новый рынок - теперь под эгидой ориентированности на безопасность граждан, антиутопию можно создать даже в рамках демократического государства.

*[Каким образом разрабатываемый продукт позволит достичь данной цели?]*

Civilla защищает базовую человеческую ценность, а именно, право на безопасность. При этом Civilla оставляет широкий простор для ограничения свободы, от уничтожения нежелательных целей для помещения таковых в психиатрические больницы.


### 3.2 Stakeholder Summary (Описание заинтересованных лиц)

*[Есть несколько групп лиц, заинтересованных в разработке вашего продукта (не все из них являются его пользователями). В данном разделе опишите их (пользователи описываются в 3.3)]*

<table>
<tr><td>

**Name (Название)**
</td><td>

**Description (Описание)**
</td><td>

**Responsibilities (Обязанности)**
</td></tr>
<tr><td>

Государства
</td><td>
Заказчики продукта Civilla.
</td><td>

* Финансирование разработки продукта.
* Выдвижение требований к продукту.
* Предоставление продукта муниципалитетам для эксплуатации.

</td></tr>
<tr><td>
Equilibrium inc.
</td><td>
Компания - поставщик продукта Civilla.
</td><td>

* Разработка продукта.
* Поставка продукта.
* Поддержка продукта.
* Согласование требований к продукту с заказчиком.

</td></tr>
</table>

### 3.3 User Summary (Описание пользователей)

*[Дайте краткое описание всех групп потенциальных пользователей]*

<table>
<tr><td>

**Name (Название)**  
</td><td>

**Description (Описание)**
</td><td>

**Responsibilities (Обязанности)**
</td><td>

**Stakeholder (Заинтересованное лицо)**
</td></tr>

<tr><td>
Инспектор
</td><td>
Сотрудник полиции
</td><td>

* Использование системы с целью контроля исполнителей.
* Использование системы для оценки обстановки в городе.
* Использование системы для ввода-вывода данных о гражданах.

</td><td>
Государство
</td></tr>

<tr><td>
Исполнитель
</td><td>
Сотрудник полиции
</td><td>

* Использование системы для определения потенциальных преступников.
* Устранение потенциальных приступников с помощью оборудования Equilibrium inc.

</td><td>
Государство
</td></tr>

<tr><td>
Аналитик
</td><td>
Сотрудник полиции
</td><td>

* Использование системы для извлечения информации из неё.
* Анализ информации, определение взамисосвязей между преступлениями и подозреваемыми с помощью ПО Equilibrium inc.

</td><td>
Государство
</td></tr>

<tr><td>
Гражданин
</td><td>
Житель государства
</td><td>

* Почти добровольно предоставляет свои личные данные для анализа

</td><td>
Государство
</td></tr>
</table>

### 3.4 User Environment (Описание рабочего окружения пользователей)

*[Опишите рабочее окружение группы пользователей. Ответьте на следующие вопросы]*  

Возьмем задачу - поимку потенциального преступника. 

*[Какое количество людей требуется для выполнения 1 задачи? Меняется ли это число?]*  

Минимальный набор действующих лиц:
- Инспектор
- Исполнитель
- Аналитик

*[Сколько длится выполнение 1 задачи? Сколько длится выполнение 1 подзадачи? Меняется ли это число?]*  

С точки зрения системы процесс выполнения задачи выглядит следующим образом:

- Система обнаруживает потенциального преступника.
- Система посылает отчет инспектору и аналитику.
- Инспектор выезжает вместе с исполнителем на задание.
- Аналитик в это время отслеживает показатели цели с помощью системы.
- Прибыв на место, инспектор с помощью системы отслеживатет положение цели и исполнителя, дает разрешение использовать оружие.
- Исполнитель преследует цель.
- Зафиксировав цель, исполнитель использует оружие Доминатор.
- Доминатор верифицирует цель через систему.
- Исполнитель уничтожает/усыпляет цель.
- Инспектор проверяет работу и отправляет отчет.

*[Есть ли особые ограничения на рабочее окружение? (мобильность и т.п.)]*  

- Места, где используется система, должны быть покрыты беспроводными сетями.

*[Какими другими приложениями пользуются пользователи? Нужна ли разрабатываемому продукту интеграция с ними?]*  

Продукт сам по себе является полным комплексом необходимых сервисов.

### 3.5 Stakeholder Profiles (Профили заинтересованных лиц)

*[В данном разделе в таблице содержится описание каждой группы заинтересованных лиц. Помните, что заинтересованным лицом может быть, как человек, так и компания или разработчики.]*

#### 3.5.1 Государство

<table><tr><td>
  
**Representative (Представитель)** 
</td><td>

*[Кто представляет данную группу лиц?]*     
Министр МВД Иванов 

</td></tr><tr><td>
  
**Description(Описание)**
</td><td>

*[Краткое описание группы лиц.]*    
Заказчики продукта Civilla. Для снижения уровня преступновсти 
в регионе


</td></tr><tr><td>
  
**Type(Уровень)** 
</td><td>

*[Оцените уровень компетенции и требовательности заинтересованных лиц - эксперт, обычный пользователь, разработчик и т.п.]*    
Заказчик

</td></tr><tr><td>
  
**Responsibilities (Обязанности)**
</td><td>

*[Перечислите главные обязанности группы заинтересованных лиц в контексте разрабатываемой системы.]*    
* Финансирование разработки продукта.  
* Выдвижение требований к продукту.  
* Предоставление продукта муниципалитетам для эксплуатации.  


</td></tr><tr><td>

**Success Criteria(Критерий успеха)**
</td><td>

*[В чем состоит успешность использования системы для данной группы заинтересованных лиц? Какова их выгода от этого?]*    
Система позволит снизить уровень преступности и снижение жертв среди гражданских.


</td></tr><tr><td>

**Involvement (Вовлеченность)**
</td><td>

*[Каким образом заинтересованное лицо вовлечено в разработку проекта? Желательно указать его роль в контексте RUP.]*    
* Взаимодействует с поставщикомю.  
* Доносит до команды разработки видение продукта.  
* Принимает решения о сроках выполнения работ и требуемой функциональности.



</td></tr><tr><td>

**Deliverables (Ожидаемый результат)**
</td><td>

*[Ожидает ли заинтересованное лицо получить какие-то дополнительные результаты кроме разработанной системы?]*    
Повышение гражданского настроения


</td></tr><tr><td>

**Comments / Issues (Комментарий / Проблемы)**
</td><td>

*[Описание проблем, которые мешают успешно использовать систему / любые уместные комментарии]*  
* Сложность разработки система.  
* Сложность развёртки системы в регионы.  
* Корректировка оценки коэффициента преступности.  


</td></tr>
</table>  
  
   #### 3.5.2 Equilibrium inc.

<table><tr><td>
  
**Representative (Представитель)** 
</td><td>

*[Кто представляет данную группу лиц?]*     
Александр Лапутько

</td></tr><tr><td>
  
**Description(Описание)**
</td><td>

*[Краткое описание группы лиц.]*    
Разработчик и поставщик продукта Civilla. 


</td></tr><tr><td>
  
**Type(Уровень)** 
</td><td>

*[Оцените уровень компетенции и требовательности заинтересованных лиц - эксперт, обычный пользователь, разработчик и т.п.]*    
Разработчик

</td></tr><tr><td>
  
**Responsibilities (Обязанности)**
</td><td>

*[Перечислите главные обязанности группы заинтересованных лиц в контексте разрабатываемой системы.]*    
* Разработка системы Civilla.
* Поставка продукта.  
* Поддержка продукта. 
* Согласование требований к продукту с заказчиком.  


</td></tr><tr><td>

**Success Criteria(Критерий успеха)**
</td><td>

*[В чем состоит успешность использования системы для данной группы заинтересованных лиц? Какова их выгода от этого?]*    
Точная оценка коэффициента преступности и предоставление точных указаний для снижения уровня преступности.


</td></tr><tr><td>

**Involvement (Вовлеченность)**
</td><td>

*[Каким образом заинтересованное лицо вовлечено в разработку проекта? Желательно указать его роль в контексте RUP.]*    
* Взаимодействует с заказчиом.  
* Разработка и поставка системы Civilla.  



</td></tr><tr><td>

**Deliverables (Ожидаемый результат)**
</td><td>

*[Ожидает ли заинтересованное лицо получить какие-то дополнительные результаты кроме разработанной системы?]*    
Получение больших инвестиций в свою компанию.


</td></tr><tr><td>

**Comments / Issues (Комментарий / Проблемы)**
</td><td>

*[Описание проблем, которые мешают успешно использовать систему / любые уместные комментарии]*  
* Сложность разработки системы.  
*  Недостаточность финансирования.  


</td></tr>
</table>


### 3.6 User Profiles (Профили пользователей)

*[В данном разделе в таблице содержится описание каждой группы пользователей.
 Помните, что по уровню технической компетенции пользователи бывают опытными
  или новичками - опытный пользователь хочет получить гибкую кроссплатформенную
   систему, а новичку важнее простота использования и отзывчивый интерфейс.]*


#### 3.6.1 Инспектор	

<table><tr><td>
  
**Representative (Представитель)** 
</td><td>

Инспектор Аканэ Цунэмори

</td></tr><tr><td>
  
**Description(Описание)**
</td><td>

Сотрудник полиции

</td></tr><tr><td>
  
**Type(Уровень)** 
</td><td>

Пользователь 

</td></tr><tr><td>
  
**Responsibilities (Обязанности)**
</td><td>

* Использование системы с целью контроля исполнителей.  
* Использование системы для оценки обстановки в городе.  
* Использование системы для ввода-вывода данных о гражданах.

</td></tr><tr><td>

**Success Criteria(Критерий успеха)**
</td><td>

Снижение уровня преступности в регионе  

</td></tr><tr><td>

**Involvement (Вовлеченность)**
</td><td>

Офицер полиции

</td></tr><tr><td>

**Deliverables (Ожидаемый результат)**

</td><td>

Использовоние системы, как средство снижения уровня преступности в регионе. 

</td></tr><tr><td>

**Comments / Issues (Комментарий / Проблемы)**
</td><td>

*[Описание проблем, которые мешают успешно использовать систему / любые уместные комментарии]*  

</td></tr><tr><td>
</td></tr>
</table>

#### 3.6.2 Исполнитель	

<table><tr><td>
  
**Representative (Представитель)** 
</td><td>

Исполнитель Синъя Когами

</td></tr><tr><td>
  
**Description(Описание)**
</td><td>

Сотрудник полиции

</td></tr><tr><td>
  
**Type(Уровень)** 
</td><td>

Пользователь 

</td></tr><tr><td>
  
**Responsibilities (Обязанности)**
</td><td>

* Использование системы для определения потенциальных преступников.
* Устранение потенциальных приступников с помощью оборудования Equilibrium inc.

</td></tr><tr><td>

**Success Criteria(Критерий успеха)**
</td><td>

Снижение уровня преступности в регионе  

</td></tr><tr><td>

**Involvement (Вовлеченность)**
</td><td>

Использование системы, как средство определения преступника в регионе.  

</td></tr><tr><td>

**Deliverables (Ожидаемый результат)**
</td><td>

Быстрый и безопасный способ устранения преступника в регионе.

</td></tr><tr><td>

**Comments / Issues (Комментарий / Проблемы)**
</td><td>

*[Описание проблем, которые мешают успешно использовать систему / любые уместные комментарии]*  

</td></tr><tr><td>
</td></tr>
</table>

#### 3.6.3 Аналитик

<table><tr><td>
  
**Representative (Представитель)** 
</td><td>

Аналитик Сион Караномори

</td></tr><tr><td>
  
**Description(Описание)**
</td><td>

Сотрудник полиции

</td></tr><tr><td>
  
**Type(Уровень)** 
</td><td>

Пользователь 

</td></tr><tr><td>
  
**Responsibilities (Обязанности)**
</td><td>

* Использование системы для извлечения информации из неё.
* Анализ информации, определение взамисосвязей между преступлениями и подозреваемыми с помощью ПО Equilibrium inc. 

</td></tr><tr><td>

**Success Criteria(Критерий успеха)**
</td><td>

Получения новых данных о гражданах и преступников в регионе. Корректировка коэффициента преступности.

</td></tr><tr><td>

**Involvement (Вовлеченность)**
</td><td>

Аналитик

</td></tr><tr><td>

**Deliverables (Ожидаемый результат)**
</td><td>

Получение больших данных. 

</td></tr><tr><td>

**Comments / Issues (Комментарий / Проблемы)**
</td><td>

*[Описание проблем, которые мешают успешно использовать систему / любые уместные комментарии]*  

</td></tr><tr><td>
</td></tr>
</table>

#### 3.6.4 Гражданин

<table><tr><td>
  
**Representative (Представитель)** 
</td><td>

Гражданин Евпатий

</td></tr><tr><td>
  
**Description(Описание)**
</td><td>

Житель государства

</td></tr><tr><td>
  
**Type(Уровень)** 
</td><td>

Пользователь 

</td></tr><tr><td>
  
**Responsibilities (Обязанности)**
</td><td>

* Почти добровольно предоставляет свои личные данные для анализа

</td></tr><tr><td>

**Success Criteria(Критерий успеха)**
</td><td>

Предоставление о себе набор необходимых данных 

</td></tr><tr><td>

**Involvement (Вовлеченность)**
</td><td>

Предоставляет входные данные для системы 

</td></tr><tr><td>

**Deliverables (Ожидаемый результат)**
</td><td>

Безопасность в своём регионе.  

</td></tr><tr><td>

**Comments / Issues (Комментарий / Проблемы)**
</td><td>

*[Описание проблем, которые мешают успешно использовать систему / любые уместные комментарии]*  

</td></tr><tr><td>
</td></tr>
</table>


### 3.7 Key Stakeholder or User Needs (Ключевые потребности заинтересованных лиц или пользователей)
*[Перечислите ключевые проблемы с решением, предоставленным заинтересованным лицом. Для каждой проблемы ответьте на следующие вопросы:*

- *Какова причина возникновения данной проблемы?*

- *Как она решается сейчас?*

- *Какое решение требуется заинтересованному лицу/пользователям?*

*Важно осознавать, что у каждой проблемы есть свой приоритет, это позволяет выявить те из них, которые обязательно необходимо решить.*

*Заполните таблицу.]*

<table>
<tr><td>

**Need (Потребность)**  
</td><td>

**Priority (Приоритет)**
</td><td>

**Concerns (Проблема)**
</td><td>

**Current Solution (Текущее решение)**
</td><td>

**Proposed Solutions(Предлагаемое решение)**
</td></tr>

<tr><td>

Обеспечение порядка. 
</td><td>

Высокий.
</td><td>

Управление полицией осуществляется неоптимально.
</td><td>

Увеличение количества сотрудников полиции в городе.
</td><td>

Использование компьютерной системы для грамотного распределения сил в городе.
</td></tr>

<tr><td>

Непредвзятая оценка статуса преступности гражданина. 
</td><td>

Средний.
</td><td>

Суждение о том, является деяние преступлением или нет выносится предвзято.
</td><td>

Использование системы судов, где решение всё равно выносят люди, руководствующиеся собственным ограниченным опытом.
</td><td>

Использование компьютерной системы для вынесения решения о статусе гражданина.
</td></tr>


<tr><td>

Затраты на обеспечение порядка. 
</td><td>

Высокий.
</td><td>

Затраты на полицию не оптимизируются и растут пропорционально росту населения.
</td><td>

Вливание большего количества средств.
</td><td>

Оптимизация полиции вместо экстенсивного роста.
</td></tr>

</table>

### 3.8 Alternatives and Competition (Конкурентные решения и альтернативы)

*[Перечислите альтернативы разрабатываемому продукту - это могут быть как продукты-конкуренты от других компаний, так и такие условия, при которых разработка не потребуется. Опишите преимущества и недостатки каждой из альтернатив.]*

#### 3.8.1 Линейка продуктов компании "Skynet"
* "+"  Автоматически использует средства вооруженных сил страны.
* "+-" Искусственный интеллект руководствуется собственной логикой и не поддается контролю.
* "+-" Обеспечивает безопасность людей по принципу "нет людей == нет проблем".
* "-"  Посылает киборгов убийц в прошлое, чтобы убить командира сопротивления.

#### 3.8.2 Компания виртуальной реальности "Matrix"
* "+" Использует спецальные капсулы, где люди, будучи подключенными к виртуальному миру, находятся в относительной безопасности.
* "-" Использует людей в качестве источника питания.
* "-" Порабощает человечество.

#### 3.8.3 Строительная фирма "Galaxy Hitchhikers"
* "+" Уничтожает все факторы, влияющие на безопасность населения.
* "-" Безопасность достигается путем уничтожения планеты.

## 4. Product Overview (Обзор продукта)
*[Данный раздел описывает разрабатываемый продукт - его возможности, взаимодействие с другими приложениями и системами. Данный раздел включает в себя 3 подраздела:*  
* *Перспективы продукта*  
* *Функционал продукта*  
* *Влияющие факторы и зависимости.]*  

### 4.1 Product Perspective (Перспектива продукта)  
*[Данный раздел описывает продукт в контексте других связанных с ним, а также окружением пользователя. Продукт может быть полностью независим от других систем или быть частью другой системы (тогда данный раздел стоит посвятить взаимодействию подсистем между собой, желательно описать данное взаимодействие с помощью диаграмм).]* 
  
Продукт обрабатывает поступающие данные, выносит результирующее число в Психопаспорт. Также продукт выносит окончательное решение о допустимых мерах воздействия на преступника в случае его задержания, руководствуясь коэффициентом преступности и непосредственно переводящий Доминатор в смертельный или несмертельный режимы.
  
 ### 4.2 Summary of Capabilities (Обзор возможностей)
 *[Опишите главные преимущества и ключевые особенности продукта, старайтесь избегать сложных терминов, чтобы эта часть документа была понятна всем. Заполните таблицу:]*  
 <table><tr><td>
  
**Customer Benefit (Выгода пользователей)** 
</td><td>

**Supporting Features (Описание функционала)**  

</td></tr><tr><td>
  
Быстрая оценка коэффицента преступности человека.
</td><td>
  
На основе поступающих данных выдаёт коэффициент преступности человека.

</td></tr><tr><td>
  
Оптимальное управление полицией.
</td><td>
  
Система определяет оптимальное расположение полицейских патрулей в городе.

</td></tr><tr><td>
  
Предоставление доступа к оружию Доминатор.
</td><td>
  
Система решает кому и когда предоставлять доступ к оружию Доминатор на основе коэффициента преступления и переводит Доминатор в смертельный или несмертельный режимы.


</td></tr></table>  

### 4.3 Assumptions and Dependencies (Влияющие факторы и зависимости)
*[Перечислите факторы, которые могут повлиять на преимущества продукта, а также на изменение данного документа.]*  
   
Главное преимущество системы Сивилла в том, что она способна определять психологическое состояние человека. Таким образом в стране сократится количество преступников.  
     
### 4.4 Cost and Pricing (Цены)  
*[В данном разделе зафиксируйте все ценовые факторы, которые могут повлиять на сбыт продукта - например, цена носителей для распространения, цена печати руководства пользователя, упаковки и т.п.]*  
    
### 4.5 Licensing and Installation (Лицензирование и установка)  
*[Дополнительные требования к лицензированию и установке продукта могут также повлиять на разработку системы и должны быть перечислены в данном разделе.]*  

* Установка оборудования производится силами заказчика при поддержке квалифицированных специалистов Equilibrium inc.

* Программное обеспечение разворачивается и поддерживается специалистами Equilibrium inc. удаленно в среде Equilibrium inc. или в среде заказчика.

* Продукты предоставляются по договору SLA. В договоре описываются условия, при которых в случае отказа системы издержки заказчика компенсирует Equilibrium inc.

* Сервисы Equilibrium inc. предоставляются по подписке.

Во время разработки будет использоваться git (GNU General Public License version 2.0). На компьютерах разработчиков будут использоваться ОС Ubuntu и Windows 10 Pro.
  
## 5. Product Features (Особенности продукта)
*[Перечислите и кратко опишите особенности продукта - возможности системы, которые необходимо реализовать для того, чтобы система приносила пользу пользователям. При описании не стоит вдаваться в технические детали, оно должно быть всем понятно, лучше фокусироваться на обеспечиваемом функционале и на причинах необходимости его разработки. Каждая особенность должна быть подробно описана в Описании Прецедента.]*  
  
 * Оценка психического состояния, личности и вероятность того, что человек будет совершать преступления на основе Психопаспорта, характеристики, выраженной в виде числа или отображённой соответствующим цветом. 

 * Вынесение окончательного решения о допустимых мерах воздействия на преступника в случае его задержания, руководствуясь коэффициентом преступности и непосредственно переводящая Доминатор из одного режима в другой.  

 * Получение доступа к оружию Доминатор - высокотехнологичному оружию, используемому полицейскими Инспекторами и Исполнителями. Доминатор самостоятельно проводит сканирование и запрашивает незамедлительный анализ данных у системы.   

 * Хранение и обработка информации, поступающей в систему.
   
 * Оптимальное управление полицией (предоставление информации об оптимальном расположении патрулей в городе), с помощью анализа информации, поступившей в систему.

 * Предоставление информации в доступном для отображения и хранения виде.

 ## 6. Constraints (Ограничения)
 *[Перечислите требования к архитектуре клиента и сервера, установленным программам и версиям библиотек.]*

* *К согласованию с заказчиком*

     
 ## 7. Quality Ranges (Оценка качества)
 *[В данном разделе определите границы параметров производительности, надежности, отказоустойчивости, удобства использования и т.п.]*

 * Сервис должен быть доступен круглосуточно за исключением случаев, когда заказчик был предупрежден по крайней мере за 7 дней о планируемом отключении системы на срок не более 2 часов для обслуживания.

 * Время доступности данных после их загрузки в систему не должно превышать времени, описанного в договоре SLA с заказчиком. Некоторое время затрачивается на синхронизацию хранилищ данных, на запуск ПО, необходимого для предоставления данных заказчику. От согласованного с заказчиком времени зависят накладные расходы Equilibrium inc. и, как следствие, стоимость продукта.  
   
## 8. Precedence and Priority (Приоритетные особенности)

*[В данном разделе определите приоритет разрабатываемых особенностей продукта, поясните свою оценку. Лучше воспользоваться таблицей, приведенной ниже:]*


<table>
<tr><td>

**Название особенности**  
</td><td>

**Приоритет**
</td><td>

**Причина присвоения приоритета**
</td></tr>

<tr><td>

Оценка психического состояния по данным видеонаблюдения.
</td><td>

Высокий.
</td><td>

Киллер-фича проекта, то, на чем держится всё остальное.
</td></tr>

<tr><td>

Хранение и обработка информации, поступающей в систему.
</td><td>

Высокий.
</td><td>

Базовый функционал системы.
</td></tr>


<tr><td>

Оптимальное управление полицией.  
</td><td>

Средний.
</td><td>

Возможность, которую необходимо реализовать, но она не имеет ключевой роли в демонстрации заказчику.
</td></tr>

<tr><td>

Управление оружием "Доминатор"
</td><td>

Низкий
</td><td>

Система функциональна и без специального оружия
</td></tr>

<tr><td>

Предоставление информации в доступном для обработки виде.
</td><td>

Средний
</td><td>

Позволяет пользователю интуитивно взаимодействовать с системой, но эта часть может быть сделана аутсорсными фирмами.
</td></tr>

</table>

## 9. Other Product Requirements (Прочие требования)

*[В данном разделе перечислите все применяемые стандарты, а также требования к производительности и окружению пользователя.]*

* Доступ к пользовательскому интерфейсу осуществляется через браузер или через мессенджеры, используемые клиентом.

* От системы требуется сохранять время отклика не более 1 секунды.

### 9.1 Applicable Standards (Применяемые стандарты)  
*[Список стандартов, которым должна соответствовать разрабатываемая система, может включать соглашения о регулировании (FDA, UCС), коммуникационные (TCP/IP, ISDN), системные (Windows, Unix) стандарты и т.д.]*

* Внутренние взамиодействия между сервисами осуществляются с помощью http запросов.

* Для взаимодействия с пользователем используется сеть интернет, браузер и http запросы. Система должна работать на новейшей версии браузера, которой пользуется заказчик. Тип браузера описывается в договоре.

### 9.2 System Requirements (Требования к системе)  
*[Напишите рекомендуемые (минимальные) системные требования своего проекта. Если ваша система имеет клиент-серверную архитектуру, то укажите отдельно требования для клиента и для сервера. Требования включают в себя наличие подключения к интернету, характеристики машин, требования к установленным программам и т.д.]*
 

* Требования для клиента: Установленные браузер и мессенджер.
* Требования к среде выполнения: kubernetes кластер, способный запускать JVM в docker - контейнерах.
* Доступ в интернет с обеих сторон.

### 9.3 Performance Requirements (Требования к производительности)  
*[Перечислите требования к производительности, которым должна соответствовать ваша система - количество одновременно работающих пользователей, количество обрабатываемых сообщений в единицу времени, точность, надежность, время отклика и т.д.]*

* От системы требуется сохранять время отклика не более 1 секунды.

* Система масштабируется в сответствии с её нагруженностью. Нагруженность определяется количеством пользователей в системе. Количество пользователей в системе определяется договором.

### 9.4 Environmental Requirements (Требования к окружению продукта)  

*[Перечислите особые требования к рабочему окружению системы. Для аппаратных систем это может быть температура воздуха, влажность и т.д. Для прикладных систем рабочим окружением являются другие программы, установленные на системе пользователя, доступ к ресурсам системы и т.д.]*

* Требования к среде выполнения: kubernetes кластер, способный запускать JVM в docker - контейнерах.

  
