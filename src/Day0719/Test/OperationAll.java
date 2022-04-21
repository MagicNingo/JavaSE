package Day0719.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OperationAll {
    /*public static Statement test() throws ClassNotFoundException, SQLException {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/school",
                    "root","123456");
            Statement statement = con.createStatement();
            return statement;

    }*/

    public int insert(SchoolClass sc) throws SQLException {
        String sql = "insert into class(id,classname) values('"+sc.getClass_id()+"','"+sc.getClass_name()+"')";

        Connection con = DBHelper.getConnection();
        Statement se = con.createStatement();
        return se.executeUpdate(sql);
    }

    public int update(SchoolClass s) throws SQLException {
        String sql = "update class set classname= '"+s.getClass_name()+"' where id ='"+s.getClass_id()+"' ";
        Connection con = DBHelper.getConnection();
        Statement se = con.createStatement();
        return se.executeUpdate(sql);
    }

    public int delete(int id) throws SQLException {
        String sql = "delete from class where id ='"+id+"'";
        Connection con = DBHelper.getConnection();
        Statement se = con.createStatement();
        return se.executeUpdate(sql);
    }

    public List<SchoolClass> selectAll() throws SQLException {
        ArrayList<SchoolClass> list = new ArrayList<SchoolClass>();
        String sql = "select * from class";
        Connection con = DBHelper.getConnection();
        Statement se = con.createStatement();
        ResultSet set = se.executeQuery(sql);
        while (set.next()){
            int  class_id = set.getInt("id");
            String class_name=set.getString("classname");
            list.add(new SchoolClass(class_id,class_name));
        }
        return list;
    }

    public SchoolClass selectByLogin(SchoolClass s) throws SQLException {
        String sql = "select * from class where id ='"+s.getClass_id()+"' and classname ='"+s.getClass_name()+"' ";
        Connection con = DBHelper.getConnection();
        Statement se = con.createStatement();
        ResultSet set = se.executeQuery(sql);

        if(set.next()){
            int  class_id = set.getInt("id");
            String class_name=set.getString("classname");
            return new SchoolClass(class_id,class_name);
        }
        return null;
    }
}
