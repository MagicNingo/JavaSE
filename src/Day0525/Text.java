package Day0525;

public class Text {
    public static void main(String[] args) {
        Factory factory = new BusFactory();
        Vehicle vehicle = factory.makeVehicle();
        vehicle.drive();

        Factory factory1 = new CarFactory();
        Vehicle vehicle1 = factory1.makeVehicle();
        vehicle1.drive();
    }
}
