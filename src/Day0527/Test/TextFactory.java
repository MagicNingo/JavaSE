package Day0527.Test;

public class TextFactory {
    public static void main(String[] args) {
        CarFactory factory = new CarFactory();
        Vehicle v = factory.makeVehicle();
        v.drive();

    }
}
