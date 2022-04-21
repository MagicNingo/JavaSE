package Day0713.work;

public class TextMyList {
    public static void main(String[] args) {
            MyList list = new MyList(5);
            list.add("AAA");
            list.add("BBB");
            list.add("hello,java!");
            list.set(0,"CCC");
            list.remove(0);
            list.remove("hello,java!");
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
