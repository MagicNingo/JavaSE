package Day0804.Test;

public class Human {
    public String id;
    private String name;
    protected int age;
    double money;

    public Human() {
    }

    protected Human(String name) {
        this.name = name;

    }
    Human(String id,String name){
        this.id = id;
        this.name = name;
    }
    private Human(int age){
        this.age = age;
    }

    private void breath(String str) {
        System.out.println(str);
        System.out.println("人类要呼吸！");
    }
    protected  void  eat() {
        System.out.println("人要吃东西！");
    }
    void  fly() {
        System.out.println("人想飞！");
    }
    public  void  Money() {
        System.out.println("人要赚钱！");
    }

    @Override
    public String toString() {
        return "Human{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", money=" + money +
                '}';
    }
}
