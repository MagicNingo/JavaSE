package Day0507.work;

public class TextPurse {
    public static void main(String[] args) {
        Purse p = new Purse("jack",10000);
        System.out.println(p);
        p.outMoney(1000);
        System.out.println(p);
        p.saveMoney(100000);
        System.out.println(p);
    }
}
