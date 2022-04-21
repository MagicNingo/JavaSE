package Day0719.work;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public interface UserDao {
    //增
    int insert(Connection con,User user)throws SQLException;

    //删
    int deleteById(Connection con,String user_name)throws SQLException;

    //改
    int updateById(Connection con,String user_name)throws SQLException;

    //查
    ResultSet selectAllUser(Connection con,String user_name)throws SQLException;
    //查
    ResultSet selectByLogin(Connection con,String user_name)throws SQLException;

    //查
    ResultSet selectName(Connection con,String user_name)throws SQLException;
    //查

}
