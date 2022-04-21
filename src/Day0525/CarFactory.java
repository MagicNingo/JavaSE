package Day0525;

public class CarFactory extends Factory {

    @Override
    public Vehicle makeVehicle() {
        return new Car();
    }
}
