package homework2;

import homework1.Book;
import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Book book1 = new Book("Война и мир", "Л. Н. Толстой", 1867); book1.setNumberOfPages(500);
        Book book2 = new Book("Преступление и наказание", "Ф. М. Достоевский", 1866); book2.setNumberOfPages(237);
        Book book3 = new Book("Евгений Онегин", "А. С. Пушкин", 1833); book1.setNumberOfPages(186);
        Book book4 = new Book("Идиот", "Ф. М. Достоевский", 1868); book1.setNumberOfPages(404);
        Book book5 = new Book("Мартин Иден", "Д. Лондон", 1909); book1.setNumberOfPages(87);
        Book book6 = new Book("Анатомия силовых упражнений", "Ф. Делавье", 2006); book1.setNumberOfPages(347);
        Book book7 = new Book("Философия Java", "Б. Эккель", 1998); book1.setNumberOfPages(430);
        Book book8 = new Book("Изучаем Java", "К. Сьерра", 2003); book1.setNumberOfPages(489);
        Book book9 = new Book("Java. Полное Руководство", "Г. Шилдт", 2012); book1.setNumberOfPages(397);
        Book book10 = new Book("Быть нельзя казаться", "А. О. Петряков", 2022); book1.setNumberOfPages(369);

        Student st1 = new Student("Andrei");
        st1.addBook(book10, book2, book5, book1, book7);
        Student st2 = new Student("Mariya");
        st2.addBook(book6, book8, book2, book4, book3);
        Student st3 = new Student("Ivan");
        st3.addBook(book10, book1, book9, book8, book5);

        List<Student> studentList = new ArrayList<>();
        studentList.add(st1);
        studentList.add(st2);
        studentList.add(st3);



        studentList.stream()
                .peek(st -> System.out.println(st))
                .map(student -> student.getBookList())
                .flatMap(bookList -> bookList.stream())
                .sorted((x,y) -> x.getNumberOfPages()-y.getNumberOfPages())
                .distinct()
                .filter(book -> book.getYear()>2000)
                .limit(3)
                .map(book -> book.getYear())
                .findFirst()
                .map(intgr -> {
                    String s;
                    if(intgr == null){
                        s = "Книга отсутсвует";
                        System.out.println(s);
                        return s;
                    } else {
                        s = "Год выпуска " + intgr;
                        System.out.println(s);
                        return s;
                    }
                });







    }
}

//ДЗ:
//        1. Создать класс Student, обязательное поле класса Student - List<Book> (минимум по 5 книг у каждого
//2. Заполнить коллекцию классами Student
//3. При помощи одного (не допускается объявления никаких промежуточных переменных, совсем никаких) стрима
//3.1. Вывести в консоль каждого студента (переопределите toString)

//3.2. Получить для каждого студента список книг
//3.3. Получить книги

//3.4. Отсортировать книги по количеству страниц (Не забывайте про условия для сравнения объектов)
//3.5. Оставить только уникальные книги

//3.6. Отфильтровать книги, оставив только те, которые были выпущены после 2000 года

//3.7. Ограничить стрим на 3 элементах

//3.8. Получить из книг годы выпуска

//3.9. При помощи методов короткого замыкания (почитайте самостоятельно что это такое) вернуть Optional от книги

//3.10. При помощи методов получения значения из Optional вывести в консоль год выпуска найденной книги, либо запись о том, что такая книга отсутствует

