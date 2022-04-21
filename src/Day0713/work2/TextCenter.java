package Day0713.work2;

public class TextCenter {
    public static void main(String[] args) {
        Center center = new Center();
        BlackPrinter p = new BlackPrinter();
        center.setPrinter(p);
        Teacher t = new Teacher("jack");
        center.printer(t);
        center.printer(center);

        ColorPrinter cp = new ColorPrinter();
        center.setPrinter(cp);
        center.printer(t);
        center.printer(center);


    }
}
