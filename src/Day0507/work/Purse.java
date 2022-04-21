package Day0507.work;

public class Purse {
    private String name;
    private int money;

    public Purse() {
    }

    public Purse(String name, int money) {
        this.name = name;
        this.money = money;
    }
    //存钱
    public void saveMoney(int money){
        this.money += money;
    }
    public void outMoney(int money){
        if(this.money>=money){
            this.money -=money;
        }else{
            System.out.println("余额不足！");

        }
    }

    @Override
    public String toString() {
        return "Purse{" +
                "name='" + name + '\'' +
                ", money=" + money +
                '}';
    }
}
