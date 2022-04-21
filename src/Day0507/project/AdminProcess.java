package Day0507.project;

import java.util.Scanner;

public class AdminProcess {
    private Bank bank;
    public AdminProcess(Bank bank){
        this.bank = bank;
    }

     public String input(){
         Scanner input = new Scanner(System.in);
         return input.next();
     }
    public void process() {

        while (true) {
            System.out.println("请选择你的操作：1.显示所有用户 2.新增用户 3.修改用户信息 4.删除用户信息 5.返回菜单");

            String choose =input();
            if ("1".equals(choose)) {
                Customer[] cus = bank.showAllCustomer();
                for (Customer c : cus) {
                    if (c != null) {
                        System.out.println(c);
                    } else {
                        System.out.println("未存储相关用户信息！");
                    }
                }
            }else if ("2".equals(choose)){
                    System.out.println("请输入新的用户名：");
                    String name = input();
                    System.out.println("请输入新用户密码：");
                    String password = input();
                    int i =  bank.addCustomer(new Customer(name,password));
                        if(i==1){
                             System.out.println("恭喜，新增用户成功！");
                         }else  if(i==0){
                             System.out.println("对不起，新增用户失败！");
                         }else if(i==-1){
                             System.out.println("对不起，用户已存在！");
                         }
            }else if ("3".equals(choose)){
                    System.out.println("请输入要修改的用户名：");
                       String name = input();
                    System.out.println("请输入要修改的密码：");
                       String password = input();
                    System.out.println("请输入要修改的电话号码：");
                       String tel = input();
                    /*System.out.println("name:"+name);
                    System.out.println("password:"+password);
                    System.out.println("tel:"+tel);*/
                    int i= bank.modifyCustomer(new Customer(name,password,tel));
                if (i == 1) {
                    System.out.println("修改用户信息成功！");
                }else if(i == 0){
                    System.out.println("修改用户信息失败！");
                }else if(i == -1){
                    System.out.println("不存在该用户信息！");
                }
            }else if ("4".equals(choose)){
                System.out.println("请输入要删除的用户:");
                String name = input();
                String  str=  bank.removeCusByName(name);
                System.out.println(str);
            }else if ("5".equals(choose)){
                break;
            }else {
                System.out.println("请您输入正确的操作选项！");
            }

        }
    }
}
