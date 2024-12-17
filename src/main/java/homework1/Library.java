package homework1;

import java.util.ArrayList;
import java.util.List;

public class Library {

    private static List<Book> books = new ArrayList<Book>();

    static {
        Book book0 = new Book("Герой нашего времени", "М. Ю. Лермонтов", 1833);
        Library.addBooksOrBooks(book0);
    }

    static void addBooksOrBooks(Book ... books){
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

    static void findBookByAuthor(String author){
        for(Book b : books){
            if(b.getAuthor().equals(author)){
                System.out.println(b);
            }
        }
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
