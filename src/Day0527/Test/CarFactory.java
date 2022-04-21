package Day0527.Test;

public class CarFactory extends Factory{

    @Override
    public Vehicle makeVehicle() {
        return new Car();
    }
}
