package Day0714.Test.SingleAnddouble;

public class TextSingle {
    public static void main(String[] args) {
            SuperMan superMan = SuperMan.getInstance();
            SuperMan superMan2 = SuperMan.getInstance();
            superMan.fly();
            System.out.println(superMan == superMan2);
    }
}
