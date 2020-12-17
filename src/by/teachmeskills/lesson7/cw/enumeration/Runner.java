package by.teachmeskills.lesson7.cw.enumeration;

import by.teachmeskills.lesson7.cw.Book;

/**
 * @author Dzmitry Fursevich
 */
public class Runner {
    public static void main(String[] args) {
        Book b = new Book("name", "some author", "some text", Genre.DOCUMENT);
        System.out.println(b);

        ErrorCode errorCode = ErrorCode.NOT_FOUND;
        System.out.println(errorCode.getCode());


    }
}
