package Day0719.work;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Helper {
    private static  String url = "jdbc:mysql://localhost:3306/LoginSystem";
    private static  String user = "root";
    private static  String password ="123456";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");//加载驱动
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static Connection getConnection(){
        try {
            return  DriverManager.getConnection(url,
                        user,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;

    }
}
