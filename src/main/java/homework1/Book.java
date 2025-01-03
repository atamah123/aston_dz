package homework1;

public class Book {

    private final String title;
    private final String author;
    private Integer year;
    private Boolean isAvailable;
    private int numberOfPages;


    public Book(String title, String author, Integer year) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.isAvailable = true;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isAvailable = true;
    }


    void borrowBook() {
        if(isAvailable) {
            isAvailable = false;
        }
    }

    void returnBook() {
        if(!isAvailable) {
            isAvailable = true;
        }
    }

    void displayInfo() {
        System.out.println(this);
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getYear() {
        return year;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    @Override
    public String toString() {
        if(isAvailable) {
            return "Название книги - \"" + title + "\"" +
                    ", автор - \"" + author + "\"" +
                    ", год издания - \"" + year + "\"" +
                    ", доступна ли к выдаче - да";
        } else {
            return "Название книги - \"" + title + "\"" +
                    ", имя автора - \"" + author + "\"" +
                    ", год издания - \"" + year + "\"" +
                    ", доступна ли к выдаче - нет";
        }

    }
}
