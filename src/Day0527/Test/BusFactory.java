package Day0527.Test;

public class BusFactory extends Factory{

    @Override
    public Vehicle makeVehicle() {
        return new Bus();
    }
}
