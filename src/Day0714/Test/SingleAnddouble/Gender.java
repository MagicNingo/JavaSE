package Day0714.Test.SingleAnddouble;

public abstract class Gender {
    public final static Gender MAN = new Gender("男") {
        @Override
        public void feature() {
            System.out.println("我是男生！");
        }

    };
    public  static Gender WOMAN = new Gender("女") {

        @Override
        public void feature() {
            System.out.println("我是女生！");
        }
    };

    private String value;

    public Gender() {
    }

    public Gender(String value) {
        this.value = value;
    }
    public abstract void feature();

    public String getValue() {
        return value;
    }

    @Override
    public String toString() {
        return value;
    }

}
