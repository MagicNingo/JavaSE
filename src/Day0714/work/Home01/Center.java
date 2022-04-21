package Day0714.work.Home01;

public class Center implements OutPrinter {

    private Printer p;


    public void print(OutPrinter op){
        p.printer(op);
    }

    @Override
    public String detail() {
        return "打印中心信息！";
    }

    public Printer getPrinter() {
        return p;
    }

    public void setPrinter(Printer p) {
        this.p = p;
    }
}
