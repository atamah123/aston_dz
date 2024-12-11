package homework1;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Война и мир", "Л. Н. Толстой");
        book1.setYear(1867);
        Book book2 = new Book("Преступление и наказание", "Ф. М. Достоевский", 1866, true);
        Book book3 = new Book("Евгений Онегин", "А. С. Пушкин", 1833, true);
        Book book4 = new Book("Идиот", "Ф. М. Достоевский", 1868, true);

        Library.addBook(book1);
        Library.addBook(book2);
        Library.addBook(book3);
        Library.addBook(book4);



        System.out.println( "###########################################\n" +
                "Выведем доступные к выдаче книги:");
        Library.printAvailableBooks();

        book1.borrowBook();
//        book0.borrowBook();
        Library.getBooks().getFirst().borrowBook();

        System.out.println( "###########################################\n" +
                "Выведем доступные к выдаче книги:");
        Library.printAvailableBooks();



        String s = "Ф. М. Достоевский";
        System.out.println( "###########################################\n" +
                "Получим и выведем книги автора: " + s);
        List<Book> authorBooks = Library.findBookByAuthor(s);


        System.out.println( "###########################################\n" +
                "Выведем весь список книг библиотеки: ");
        Library.displayInfo();
    }
}
