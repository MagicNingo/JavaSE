package Day0713.work2;

public class Center implements  Introduction {
    private Printer printer;

    public void printer(Introduction i) {
        printer.print(i);
    }

    public String detail() {
        return "教学中心的信息！";

    }

    public Printer getPrinter() {
        return printer;
    }

    public void setPrinter(Printer printer) {
        this.printer = printer;
    }
}
