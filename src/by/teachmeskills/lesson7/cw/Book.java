package by.teachmeskills.lesson7.cw;

/**
 * @author Dzmitry Fursevich
 */
public class Book implements BookPrintable, Searchable {
    private String name;
    private String author;
    private String content;

    public Book(String name, String author, String content) {
        this.name = name;
        this.author = author;
        this.content = content;
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
}
