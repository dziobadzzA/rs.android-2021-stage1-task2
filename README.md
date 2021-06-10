# Task 2
:mortar_board: :mortar_board: Task 2 состоит из трёх задач. Все заготовки задач находятся в корне проекта в папке *src/main/kotlin*. В каждой заготовке вам дан класс с открытым методом, в который нужно написать код для решения поставленной задачи. Все - как и для Task 1.

<img alt="structure_of_tasks" src="/images/img1.png" />

Тесты находятся в папке *src/test/kotlin*. Тесты можно запускать различными способами. Например, выполнить таск Gradle: *Gradle -> Tasks -> verification -> test*. Тогда прогонятся все unit-тесты сразу:

<img alt="launch test via Gradle" src="/images/img_5.PNG" />

Или открыть класс с тестом и нажать на зелёный треугольник рядом с объявлением класса. Если все тесты пройдены успешно :smiley_cat:, они отмечаются зеленым значком :heavy_check_mark:, иначе :scream_cat: - красным :heavy_exclamation_mark:

:exclamation: В последних версиях Android Studio (>= 4.2) убрали по-умолчанию построение дерева tasks Gradle. Поэтому вы можете не найти задачу *test* в `Gradle -> Tasks -> verification -> test` и тесты могут не запускаться.

Во-первых, эту несправедливость несложно поправить. Зайдите в `File -> Settings -> Experimental` и отключите `Do not build Gradle task list during Gradle sync`. Затем сделайте sync проекта с Gradle: `File -> Sync Project with Gradle Files`

Во-вторых, всегда можно запустить тесты в консоли, набрав `./gradlew test`.

:exclamation: Замечание, для задачек, которые работают с датами: Локаль на сервере может отличаться от вашей. Отсюда - локально тесты могут проходить, а на сервере - падать. Подумайте, как это исправить.

Если вы пришли к выводу, что выполнили максимум того что могли сделать, то сделайте Submit задачи через 
https://app.rs.school/

</br></br>

## Условия задач

### 1) Date Formatter

Робот Геннадий, умный робот. Он умеет говорить на правильном русском языке и по дате определяет день недели. Будь как Геннадий.

Задача:
Реализуйте метод, который по числу, месяцу и году определяет день недели и возвращает его в правильном падеже.

Пример:

- Входные данные: 17 11 2020
- Выходная строка: 17 ноября, вторник
</br></br>

- Входные данные: 18 3 2019
- Выходная строка: 18 марта, понедельник
</br></br>

- Входные данные: 29 2 2017
- Выходная строка: Такого дня не существует
</br></br>


**Input:** three parameters - day: String, month: String, year: String

**Output:** text representation of Date - "$day $text_month, $text_day_of_the_week" or "Такого дня не существует" 
</br></br>

### 2) Abbreviation

You can perform the following operations on the string **a** 

1. Capitalize zero or more of **a**'s lowercase letters.
2. Delete all of the remaining lowercase letters in **a**.

Given two strings, **a** and **b**, determine if it's possible to make **a** equal to **b** as described. If so, print *"YES"* on a new line. Otherwise, print *"NO"*.

For example, given **a = AbcDE** and **b = ABDE**, in **a** we can convert *"b"* and delete *"c"* to match **b**. If **a = AbcDE** and **b = AFDE**, matching is not possible because letters may only be capitalized or discarded, not changed.

**Function Description**

Complete the function *abbreviation()*. It must return either *YES* or *NO*.


**Input:** two parameters - **a**: the String to modify, **b**: the String to match. String **a** consits only of uppercase and lowercase English letters, ascii[A-Za-z]. String **b** consists only of uppercase English letters, ascii[A-Z]

**Output:** String "YES" if it's possible to make string **a** equal to string **b**. Otherwise, print "NO" 

**Sample Input:** abbreviation("daBcd", "ABC")

**Output:** "YES"

<img alt="abbreviation" src="/images/img3.PNG" />

We have **a = daBcd** and **b = ABC**. We perform the following operation:
1. Capitalize the letters *"a"* and *"c"* in **a** so that **a = daBcd**
2. Delete all the remaining lowercase letters in *a* so that **a = ABC**

Because we were able to successfully convert **a** to **b**, we print *"YES"* .
</br></br>

### 3) Blocks

Робот Пафнутий узнал про блоки. И теперь он отказывается работать как-то по другому.

Помоги Пафнутию выполнить простейшие операции с разными типами объектов.

blockA — принимает данные. В блок передается массив разных объектов. Числа, строки, даты. Массив без данных Пафнутий не принимает.

blockB — принимает данные. В блок передается класс объекта, с которым нужно работать.

blockC — возвращает данные на основе тех, которые были получены в блоках A и B.

В зависимости от принимаемого массива в блоке A и класса в блоке B в блок C возвращается:
1. Для чисел — сумма всех чисел
2. Для строк — конкатенация всех строк
3. Для дат — самая позняя (т.е. ближайшая к текущему дню) дата в виде строки в формате dd.MM.yyyy

blockC вызывается, когда у Пафнутия хватает данных для вычисления

Пример:
- В blockA передаем массив [1, "4", 2, "3"]
- В blockB передаем класс String
- В blockC возвращает "43", так как из массива в блоке А берутся элементы типа String (из блока B) - "4" и "3" - и происходит их конкатенация

**Input:** 
- blockA - cписок с объектами Array одного из трех типов (тип объектов может быть String, Int или LocalDate)
- blockB - тип объекта KClass<*>
  
**Output:** blockC: Any - результат, согласно условиям описанным выше
</br></br>

:ok_hand:
