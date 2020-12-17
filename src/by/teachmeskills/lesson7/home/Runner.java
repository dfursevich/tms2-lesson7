package by.teachmeskills.lesson7.home;

/**
 * @author Dzmitry Fursevich
 */
public class Runner {
    public static void main(String[] args) {
        Car audi = new Car(100);
        System.out.println("audi.countDistance(10) = " + audi.countDistance(10));
        System.out.println("audi.countDistance(20) = " + audi.countDistance(20));
    }
}
