package Day0719.Test;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBHelper {
    private static  String url = "jdbc:mysql://localhost:3306/school";
    private static  String user = "root";
    private static  String password ="123456";

    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        System.out.println("驱动加载成功！");
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
