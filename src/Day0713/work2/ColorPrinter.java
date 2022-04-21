package Day0713.work2;

public class ColorPrinter extends Printer {
    @Override
    public void print(Introduction i) {
        System.out.println("彩色打印："+i.detail());
    }
}
