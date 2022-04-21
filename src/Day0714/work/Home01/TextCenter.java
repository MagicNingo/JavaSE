package Day0714.work.Home01;


public class TextCenter {
    public static void main(String[] args) {
        Center center = new Center();
        BlackPrinter b = new BlackPrinter();

        center.setPrinter(b);

        Teacher t = new Teacher();
        t.setName("jack");
        Student s = new Student();
        s.setName("rose");

        center.print(t);
        center.print(s);
    }
}
