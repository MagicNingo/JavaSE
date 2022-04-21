package Day0714.Test.SingleAnddouble;

public enum Sex {
    //枚举类的属性：默认就是 static final
    MAN("男"){
        @Override
        public void feature() {
            System.out.println("男生！");
        }
    },WOMAN("女") {
        @Override
        public void feature() {
            System.out.println("女生！");
        }
    };
    private String value;

    // 枚举类的构造方法默认私有化
    Sex(String value){
        this.value = value;
    }
    public abstract void feature();

}
