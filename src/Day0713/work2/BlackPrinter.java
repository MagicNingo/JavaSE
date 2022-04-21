package Day0713.work2;

public class BlackPrinter extends Printer {
    @Override
    public void print(Introduction i) {
        System.out.println("黑白打印："+i.detail());
    }
}
