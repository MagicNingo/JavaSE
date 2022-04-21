package Day0714.work.Home01;

public class BlackPrinter extends Printer {
    @Override
    public void printer(OutPrinter op) {
        System.out.println("黑白打印："+op.detail());
    }
}
