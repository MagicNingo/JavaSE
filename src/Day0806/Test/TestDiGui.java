package Day0806.Test;

public class TestDiGui {
    public int two(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        return two(n-1) + two(n-2);
    }



    public static void main(String[] args) {
        TestDiGui t = new TestDiGui();
        int i = t.two(10);
        System.out.println(i);


    }
}
