package Day0527.Test;

public class Car extends  GrandVehicle{
    private String brand;
    private String color;

    @Override
    public void drive(){
        System.out.println("小汽车跑的快！");
    }
}
