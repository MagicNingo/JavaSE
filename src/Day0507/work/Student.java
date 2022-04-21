package Day0507.work;

public class Student {
    public static String schoolName;
    //全局变量:静态属性直接属于类，所以该类对象共有这一个属性
    //静态方法:静态方法直接属于类，以类名直接调用

    private String name;
    private int age;
    String gender="未知";
    public void eating(){
        System.out.println("人类要吃东西！");
    }

    public Student() {
    }

    public Student(String name, int age) {
        this.name = name;
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

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
