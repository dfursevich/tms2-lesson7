package by.teachmeskills.lesson7.cw;

/**
 * @author Dzmitry Fursevich
 */
public class ObjectExample {
    public static void main(String[] args) {
        Object book1 = new Book("", "" ,"");

        Book book2 = new Book("", "" ,"");
        
        System.out.println("book.getClass() = " + book1.getClass());

        if (book1.equals(book1)) {

        }
    }
}
