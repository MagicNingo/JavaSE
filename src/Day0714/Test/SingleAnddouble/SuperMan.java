package Day0714.Test.SingleAnddouble;

public class SuperMan {
    private String name;
    private int age;

    //private static SuperMan superMan = new SuperMan();//饿汉式
    //private static SuperMan superMan;//懒汉式

    private SuperMan(){
    }
    //---------------饿汉式-------------------
    /*
        public static SuperMan getInstance(){
            return superMan;
        }
    */

    //---------------懒汉式-------------------
    /*public static SuperMan getInstance() {
        if (superMan == null){
            superMan = new SuperMan();
        }
        return superMan;
    }*/

    //---------------静态内部类式-----------------
    private static class Inner{
        private static SuperMan superMan = new SuperMan();
    }
    public static SuperMan getInstance() {
        return Inner.superMan;
    }

    public void fly(){
        System.out.println("超人会飞！");
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
}
