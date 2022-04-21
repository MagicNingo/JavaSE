package Day0507.project;

import java.util.Scanner;

public class CustomerProcess {
    private Bank bank;
    public CustomerProcess(Bank bank){
        this.bank = bank;
    }
    public String input(){
        Scanner input = new Scanner(System.in);
        return input.next();
    }
    public void process(String name){
        while(true){
            System.out.println("请选择操作选项: 1.存钱 2.取钱 3.修改登录密码 4.查看账户余额 5.退出登录");
            String choose =input();
            if ("1".equals(choose)) {
                    System.out.println("请输入要存钱的数目:");
                    double money = Double.parseDouble(input());
                    boolean f = bank.addMoney(name,money);
                    if (f) {
                        System.out.println("您已成功将钱存入账户!");
                    }else{
                        System.out.println("存入账户失败,请联系管理员!");
                    }
            }else if ("2".equals(choose)){
                    System.out.println("请输入需要取钱的数目:");
                    double money = Double.parseDouble(input());
                    String str = bank.outMoney(name,money);
                    System.out.println(str);
            }else if ("3".equals(choose)){
                    System.out.println("请输入新的用户密码:");
                    String password = input();
                    Boolean f = bank.modifyPassword(new Customer(name,password));
                    if(f){
                        System.out.println("修改用户密码成功!");
                        //修改密码成功打断循环,需要重新登录
                        break;
                    }else {
                        System.out.println("修改用户密码失败!");
                    }
            }else if ("4".equals(choose)) {
                    Customer  c = bank.checkMoneyByName(name);
                    System.out.println("用户"+c.getUserName()+",当前余额为"+c.getMoney());
            }else if ("5".equals(choose)){
                    break;
            }else {
                    System.out.println("请输入正确的操作选项!");
            }
        }
    }
}
