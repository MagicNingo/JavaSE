package Day0507.project;

public class Customer {
    private String userName;
    private String password;
    private double money;
    private String tel;

    public Customer() {

    }

    public Customer(String userName, String password) {
        this.userName = userName;
        this.password = password;
    }

    public Customer(String userName, String password,String tel ) {
        this.userName = userName;
        this.password = password;
        this.tel = tel;
    }

    public Customer(String userName, String password, double money, String tel) {
        this.userName = userName;
        this.password = password;
        this.money = money;
        this.tel = tel;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + userName + '\'' +
                ", password='" + password + '\'' +
                ", money=" + money +
                ", tel='" + tel + '\'' +
                '}';
    }
}
