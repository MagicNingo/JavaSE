package Day0719.work;

import java.util.Date;

public class User {
    private String  user_name;
    private Date    year;
    private String  password;



    public User() {
    }

    public User(String user_name, String password) {
        this.user_name = user_name;
        this.password = password;
    }

    public User(String password, String user_name, Date year) {
        this.password= password;
        this.user_name = user_name;
        this.year = year;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public Date getYear() {
        return year;
    }

    public void setYear(Date year) {
        this.year = year;
    }

    @Override
    public String toString() {
        return "用户名=" + user_name + '\t' + "用户密码=" + password ;
    }
}
