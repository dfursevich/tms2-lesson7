package by.teachmeskills.lesson7.cw.button;

/**
 * @author Dzmitry Fursevich
 */
public class Button {
    private ClickHandler handler;
//    private String color;
//    private int height;

    public Button(ClickHandler handler) {
        this.handler = handler;
    }

    public void click() {
        handler.onClick();
    }
}
