package Day0525;

public class Car extends  GrandVehicle {
    private String brand;

    @Override
    public void drive() {
        System.out.println("小汽车开走了！");
    }
}
