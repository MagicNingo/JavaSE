package Day0719.work;

import java.io.IOException;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Login {
    public String input(){
        byte[] buf = new byte[50];
        try {
            System.in.read(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(buf).trim();
    }

    public static void main(String[] args) {
        UserDaoImp dao = new UserDaoImp();
        Login login = new Login();
        boolean f = true;
        Connection con = Helper.getConnection();
        while (f){
            System.out.println("请选择你要进行的操作: 1.登录  2.注册  3.退出 ");
             String choose=login.input();
            if ("1".equals(choose)){
                System.out.println("请输入用户名：");
                String u = login.input();
                System.out.println("请输入密码：");
                String p = login.input();
                ResultSet set=null;
                try {
                    set = dao.selectByLogin(con,u);
                    if (set.next()==false){
                        System.out.println("用户名错误！");
                    }else {
                        if(p.equals(set.getString("password"))){
                            System.out.println("登录成功！");
                            while(f){
                                System.out.println("请选择你要进行的操作: 1.修改账户  2.删除用户  3.查询用户  4.返回上一级");
                                String ss = login.input();
                                if("1".equals(ss)){
                                    System.out.println("请输入用户名：");
                                    String s = login.input();
                                    set = dao.selectName(con,s);
                                    if(set.next()==true){
                                        System.out.println("请输入要修改的密码：");
                                        s=login.input();
                                        dao.updateById(con,s);
                                        System.out.println("修改成功！");
                                    }else {
                                        System.out.println("用户名错误,修改失败！");
                                    }
                                }else if ("2".equals(ss)){
                                    System.out.println("请输入用户名：");
                                    String s = login.input();
                                    set = dao.selectName(con,s);
                                    if(set.next()==true){
                                        dao.deleteById(con,s);
                                        System.out.println("删除成功！");
                                    }else {
                                        System.out.println("用户名输入错误,删除失败！");
                                    }
                                }else if ("3".equals(ss)){
                                    System.out.println("请输入用户名：");
                                    String s = login.input();
                                    set = dao.selectName(con,s);
                                    if(set.next()==true){
                                        System.out.println("查询成功！");
                                        ResultSet r = dao.selectAllUser(con,s);
                                        ArrayList<User> list = new ArrayList<>();
                                        while(r.next()){
                                            String user_name = r.getString("user_name");
                                            String password = r.getString("password");
                                            list.add(new User(user_name,password));
                                        }
                                        System.out.println(list);
                                    }else {
                                        System.out.println("查无此人！");
                                    }

                                }else if ("4".equals(ss)){
                                    break;
                                }
                            }

                        }else{
                            System.out.println("密码错误！");
                        }
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }

            }else if ("2".equals(choose)){
                System.out.println("请输入用户名：");
                String u = login.input();
                System.out.println("请输入密码：");
                String p = login.input();
                User user = new User(u,p);
                try {
                    int i = dao.insert(con, user);
                    if (i>0){
                        System.out.println("注册成功！");
                    }else {
                        System.out.println("注册失败！");
                    }
                } catch (SQLException e) {
                    e.printStackTrace();
                }
            }else {
                break;
            }

        }





    }
}
