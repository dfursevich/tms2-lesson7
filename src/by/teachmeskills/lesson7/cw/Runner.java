package by.teachmeskills.lesson7.cw;

/**
 * @author Dzmitry Fursevich
 */
public class Runner {
    public static void main(String[] args) {
        Printable b = new Book("Harry Potter", "J.R", "some book text");
        Searchable s = new Book("Lord of the ring", "Tolkien", "another book text");
        Searchable bSearchable = (Searchable) b;
        System.out.println("bSearchable = " + ((Book) b).getName());
        //

        Book book1 = new Book("Harry Potter", "J.R", "some book text");
        Book book2 = new Book("Lord of the ring", "Tolkien", "another book text");
        Magazine magazine = new Magazine("Kp");
        Newspaper newspaper = new Newspaper();

        Printable[] printables = new Printable[] { book1, book2, magazine, newspaper};

        for (int i = 0; i < printables.length; i++) {
            Printable p = printables[i];
            p.print();
        }

        for (int i = 0; i < printables.length; i++) {
            Printable p = printables[i];
            if (p instanceof Book) {
                ((Book) p).printBook();
            } else if (p instanceof Magazine) {
                ((Magazine) p).printMagazine();
            } else if (p instanceof Newspaper) {
                p.print();
            }
        }
    }
}
