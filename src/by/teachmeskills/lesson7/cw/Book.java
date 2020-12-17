package by.teachmeskills.lesson7.cw;

import by.teachmeskills.lesson7.cw.enumeration.Genre;

/**
 * @author Dzmitry Fursevich
 */
public class Book implements BookPrintable, Searchable {
    private String name;
    private String author;
    private String content;
    private Genre genre;

    public Book(String name, String author, String content) {
        this.name = name;
        this.author = author;
        this.content = content;
    }

    public Book(String name, String author, String content, Genre genre) {
        this.name = name;
        this.author = author;
        this.content = content;
        this.genre = genre;
    }

    public String getName() {
        return name;
    }

    public String getAuthor() {
        return author;
    }

    @Override
    public void print() {
        System.out.println("print book");
    }

    public void printBook() {
        System.out.println("print book");
    }

    @Override
    public void printTitle() {
        System.out.println("print book title");
    }

    @Override
    public boolean containsText(String text) {
        return content.contains(text);
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", content='" + content + '\'' +
                ", genre=" + genre +
                '}';
    }
}
