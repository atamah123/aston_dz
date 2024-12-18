package homework1;

import java.io.Externalizable;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Война и мир", "Л. Н. Толстой");
        book1.setYear(1867);
        Book book2 = new Book("Преступление и наказание", "Ф. М. Достоевский", 1866);
        Book book3 = new Book("Евгений Онегин", "А. С. Пушкин", 1833);
        Book book4 = new Book("Идиот", "Ф. М. Достоевский", 1868);

        Library.addBook(book1);
        Library.addBook(book2, book3, book4);



        System.out.println( "###########################################\n" +
                "Выведем доступные к выдаче книги:");
        Library.printAvailableBooks();

        book1.borrowBook();
//        book0.borrowBook(); - попытка взять книгу, которая инициализирована в static блоке из библиотеки
        Library.getBooks().getFirst().borrowBook(); // getBooks() возвращает static лист класса Library
                          // getFirst() метод List

        System.out.println( "###########################################\n" +
                "Выведем доступные к выдаче книги:");
        Library.printAvailableBooks();



        String s = "Ф. М. Достоевский";
        System.out.println( "###########################################\n" +
                "Получим и выведем книги автора: " + s);
        Library.findBookByAuthor(s);


        System.out.println( "###########################################\n" +
                "Выведем весь список книг библиотеки: ");
        Library.displayInfo();
    }
}
