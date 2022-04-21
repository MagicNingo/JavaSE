package Day0527.Test;

public class Human {
    private String name;
    protected int age;

    public Human() {
    }

    public Human(String name) {
        this.name = name;

    }
    private Human(int age){
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void breath(String str) {
        System.out.println(str);
        System.out.println("人类要呼吸！");
    }

    @Override
    public String toString() {
        return "Human{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
