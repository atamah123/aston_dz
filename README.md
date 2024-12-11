Реализуйте программу, которая моделирует простую библиотеку книг.
Чек-лист для выполнения задачи:
1. Создайте класс Book с полями:
   title (название книги),
   author (автор),
   year (год издания),
   isAvailable (доступна ли книга для выдачи, изначально true).
2. Реализуйте:
   2.1. Несколько перегруженных конструкторов для создания объектов:
   2.1.1 Конструктор, принимающий все поля.
   2.1.2.Конструктор, который задает только название книги и автора,
   остальные поля заполняются значениями по умолчанию.
   2.2 Методы
   2.2.1 void borrowBook(): устанавливает isAvailable в false, если
   книга доступна.
   2.2.2 void returnBook(): устанавливает isAvailable в true.
   2.2.3 void displayInfo(): выводит на экран информацию о книге
   3 Создайте класс Library, который содержит:
   3.1 Поле books — массив или список книг.
   3.2 Метод addBook(Book book): добавляет книгу в библиотеку.
   3.3 Метод printAvailableBooks(): выводит все доступные книги.
   3.4 Метод findBooksByAuthor(String author): возвращает книги
   автора.
4. Желательно использовать:
   4.1 Статический блок инициализации для добавления нескольких книг
   при запуске программы.
   4.2 Модификаторы доступа private и public для правильного
   инкапсулирования.
5. Для демонстрации результата в классе Main:
   5.1 Создайте несколько книг с использованием разных конструкторов.
   5.2 Добавьте их в библиотеку.
   5.3 Выведите доступные книги.
   5.4 Возьмите одну книгу, измените ее статус и снова выведите
   доступные книги