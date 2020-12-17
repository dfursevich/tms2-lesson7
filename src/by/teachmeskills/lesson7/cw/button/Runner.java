package by.teachmeskills.lesson7.cw.button;

import by.teachmeskills.lesson7.cw.Book;

/**
 * @author Dzmitry Fursevich
 */
public class Runner {
    public static void main(String[] args) {
        ClickHandler ch = new OrderBook();
//        Button button = new Button(ch);
        Button button = new Button(new OrderBook());
        button.click();
    }
}
