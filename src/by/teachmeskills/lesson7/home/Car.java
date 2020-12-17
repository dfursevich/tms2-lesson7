package by.teachmeskills.lesson7.home;

/**
 * @author Dzmitry Fursevich
 */
public class Car {
    private int maxSpeed;

    public Car(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public float countDistance(int time) {
        return maxSpeed * time;
    }
}
