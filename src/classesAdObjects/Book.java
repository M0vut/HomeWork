package classesAdObjects;

public class Book {
    private int age;
    private Author author;

    private String bookTitle;

    public Book(int age, Author author, String bookTitle) {
        this.age = age;
        this.author = author;
        this.bookTitle = bookTitle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }
}
