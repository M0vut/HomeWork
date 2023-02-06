package classesAdObjects;

import java.util.Objects;

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
    @Override
    public String toString() {
        return "Впервые вышла в " +
                " " + age +
                "г ," + author +
                " ,название книги " + bookTitle ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return age == book.age && Objects.equals(author, book.author) && Objects.equals(bookTitle, book.bookTitle);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, author, bookTitle);
    }
}
