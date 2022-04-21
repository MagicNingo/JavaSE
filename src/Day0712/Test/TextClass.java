package Day0712.Test;

public class TextClass {
    private int id = 1;
    private  String name= "私有静态属性";
    public static int money =1000;

    class Inner01 {
        public void set() {
            System.out.println(id);
            System.out.println(name);
            System.out.println(money);
        }
    }
    static class Inner02{
        public void setTo(){
            System.out.println(money);
        }
    }
    public Object two() {
        class Inner03 {
            public void one (){
                System.out.println(money);
            }
        }
        Inner03 inner03 = new Inner03();
        return inner03;
    }

    public static void main(String[] args) {
        TextClass.Inner01 in01 = new TextClass().new Inner01();
        in01.set();
        System.out.println("++++++++++++++++++++");
        TextClass.Inner02 in02 = new TextClass.Inner02();
        in02.setTo();
        Object t = new TextClass().two();

    }


}
