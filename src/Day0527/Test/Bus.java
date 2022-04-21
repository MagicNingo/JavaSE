package Day0527.Test;

public class Bus extends GrandVehicle{
    private String brand;
    @Override
    public void drive() {
        System.out.println("公交车载着一群人！");
    }
}
