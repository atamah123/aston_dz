package homework2;

import homework1.Book;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {

    String name;
    List<Book> bookList;

    public Student(String name) {
        this.name = name;
        this.bookList = new ArrayList<>();
    }

     void addBook(Book ... book){
        Collections.addAll(bookList, book);
    }

    public List<Book> getBookList() {
        return bookList;
    }


    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    @Override
    public String toString() {
        String books = bookList.stream()
                .map(book -> {String s; return s = "\n"+book;})
                .reduce((ss, s )-> ss += s)
                .get().toString();
        return "Имя студента: " + name;
//                + ", спсик книг: " + books;
        }
}

