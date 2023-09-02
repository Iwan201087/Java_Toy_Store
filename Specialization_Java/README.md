# Промежуточная контрольная работа по блоку специализация
## Задание №2. Магазин игрушек (Java)

### 1. Информация о проекте


__Программа на Java__  
Необходимо написать программу, для розыгрыша игрушек в магазине детских товаров.

__Задание__  

Необходимо написать программу – розыгрыша игрушек в магазине детских товаров. Стараемся применять ООП и работу с файлами. Если какой-то пункт не изучали и не знаете, как сделать, то можете сделать своим способом. Например, у кого в курсе не было ООП, то применяем списки\массивы\словари

### 2. Желательный функционал программы:
1. В программе должен быть минимум один класс со следующими свойствами:id игрушки,текстовое название,количество,частота выпадения игрушки (вес в % от 100).
2. Метод добавление новых игрушек и возможность изменения веса (частоты выпадения игрушки).
3. Возможность организовать розыгрыш игрушек.
С помощью метода выбора призовой игрушки – мы получаем эту призовую игрушку и записываем в список\массив. Это список призовых игрушек, которые ожидают выдачи. Еще у нас должен быть метод – получения призовой игрушки. После его вызова – мы удаляем из списка\массива первую игрушку и сдвигаем массив. А эту игрушку записываем в текстовый файл. Не забываем уменьшить количество игрушек.

### 3. Реализация готового проекта
Так как мы разрабатываем  программу с пользовательским интерфейсом, в ходе написания мы будем руководствоваться принципом  MVC, т.е  разделим нашу  программу на три составных модуля (компонента).  

 __Model.__ Первый модуль — так называемая модель. Он содержит всю логику  работы нашего приложения, а так же инкапсулирует (объединяет) данные приложения (классы находящиеся в нем бдут описывать непосредственно сами разыгрываемые игрушки (Toy.java) и магазин, в котором будет происходить розыгрыш (ToyStore.java)).

__View.__ Второй модуль — вид. Данный модуль будет отвечает за визуализацию и отображение данных пользователю ( класс находящиеся в нем будет отвечать за визуализацию розыгрыша в магазине игрушек (ToyStoreView.java)).

__Controller.__ Последний модуль -  контроллер (ToyStoreController.java). Он будет отвечать за обработку действий пользователя и непосредственно управлять магазином игрушек ( в нем будут описаны методы для добавления игрушек, обновления частоты выпадения конкретной игрушки, методы для организации розыгрыша, получения игрушки в результате розыгрыша, а так же организации записи результатов розыгрыша в файл ).  
 
Результаты проведения очередного розыгрыша будут записываться в отдельный txt файл (prize_toys.txt).


Для облегчения чтения кода программы будет вестись документирование при помощи javadoc.