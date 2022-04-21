package Day0719.Test;

import Day0719.work.BaseDao;

import java.sql.*;

public class TestJDBC {
    public static void main(String[] args) {
        //1. 加载驱动
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            System.out.println("---驱动加载成功---");

        //2. 得到连接
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school",
                    "root","123456");
        //3. 得到执行平台
            Statement statement = con.createStatement();

            //String sql = "insert into student(id,name,age,gender,classid) " +
                    //"values('8','leen',20,'M','1')";
            String sql = "select * from student";
        //4. 执行sql语句

            ResultSet resultSet = statement.executeQuery(sql);
            System.out.println("id\t"+"name\t"+"age\t"+"gender\t"+"calssid\t");
            while (resultSet.next()){

                System.out.println(resultSet.getString(1)+"\t"+
                        resultSet.getString(2)+"\t"+
                        resultSet.getString(3)+"\t"+
                        resultSet.getString(4)+"\t"+
                        resultSet.getString(5)
                );
            }

            //int f = statement.executeUpdate(sql);

            //System.out.println(f);

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao dao = new BaseDao();
            dao.closeAll();
        }

    }
}
