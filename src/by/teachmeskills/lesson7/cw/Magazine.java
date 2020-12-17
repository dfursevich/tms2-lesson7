package by.teachmeskills.lesson7.cw;

/**
 * @author Dzmitry Fursevich
 */
public class Magazine implements Printable {
    private String name;

    public Magazine(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void printMagazine() {
        System.out.println("print magazine");
    }

    @Override
    public void print() {
        System.out.println("print magazine");
    }
}
