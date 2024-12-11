package homework1;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private static List<Book> books = new ArrayList<Book>();

    private static List <Book> authorBooks = new ArrayList<>();

    static {
        Book book0 = new Book("Герой нашего времени", "М. Ю. Лермонтов", 1833, true);
        Library.addBook(book0);
    }

    static void addBook(Book book){
        books.add(book);
    }

    static void addBook(Book book, Book ... books){
        Library.books.add(book);
        for(Book b : books){
            Library.books.add(b);
        }
    }

    static void printAvailableBooks(){
        for(Book b : books){
            if(b.isAvailable()){
                b.displayInfo();
            }
        }
    }

    static List<Book> findBookByAuthor(String author){

        authorBooks.clear();

        for(Book b : books){
            if(b.getAuthor().equals(author)){
                Book copyBook = b;
                authorBooks.add(copyBook);
                System.out.println(b.toString());
            }
        }

        return new ArrayList<>(authorBooks);
    }

    static void displayInfo() {
        for(Book b : books){
            b.displayInfo();
        }
    }

    public static List<Book> getBooks() {
        return books;
    }
}
