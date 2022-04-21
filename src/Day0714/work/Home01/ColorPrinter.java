package Day0714.work.Home01;

public class ColorPrinter extends Printer {

    @Override
    public void printer(OutPrinter op) {
        System.out.println("彩色打印:"+op.detail());
    }
}
