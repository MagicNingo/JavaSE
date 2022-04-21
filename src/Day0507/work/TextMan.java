package Day0507.work;

public class TextMan {
    public static void main(String[] args) {
            //父类声明，子类实例化 ----子类失去了自己特有的方法和属性
            Student stu1 = new Man();
            Student stu2 = new Women();
            //属性看声明，方法看对象
            stu1.eating();
            stu2.eating();
            System.out.println("性别："+stu1.gender);



    }
}
