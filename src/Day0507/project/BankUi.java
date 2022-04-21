package Day0507.project;

import java.util.Scanner;

public class BankUi {
     private final Bank bank;
     private final AdminProcess ap;
     private final CustomerProcess cp;

    public BankUi(String name) {
        bank = new Bank(name);
        ap = new AdminProcess(bank);
        cp = new CustomerProcess(bank);
    }

    public  String input(){
         Scanner in = new Scanner(System.in);
         return in.next();
     }
    //主要进程
    public void process(){
        System.out.println("欢迎使用"+bank.getBankName()+"银行管理系统");

        while(true){
            System.out.println("请选择您的操作： 1.管理员登录  2.用户登录  3.退出");
            String op = input();

            if("1".equals(op)) {
                System.out.println("请输入您的用户名：");
                String name = input();
                System.out.println("请输入您的密码：");
                String password = input();
                boolean a = bank.adminLogin(new Admin(name, password));
                if (a) {
                    System.out.println("欢迎管理员" + name + "使用系统！");
                    ap.process();
                } else {
                    System.out.println("用户名或密码错误！");

                }

            }else  if ("2".equals(op)) {
                System.out.println("请输入您的用户名：");
                String userName = input();
                System.out.println("请输入您的密码：");
                String pass = input();
                boolean f = bank.cusLogin(new Customer(userName, pass));
                if (f) {
                    System.out.println("欢迎用户"+userName+",使用"+bank.getBankName()+"银行系统!");
                    cp.process(userName);
                } else {
                    System.out.println("用户名或密码错误！");
                }
            }else if ("3".equals(op)) {
                    break;
            }else {
                System.out.println("请您输入正确选项！");
          }
        }
        System.out.println("-----end------");
    }

}
