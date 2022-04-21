package Day0719.work;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDaoImp extends BaseDao implements UserDao{
    @Override
    public int insert(Connection con, User user) throws SQLException {
        String sql = "insert into user(user_name,password) values(?,?)";

        return super.insert(con,sql,user.getUser_name(),user.getPassword());
    }
    public int[] insertUsers(Connection con, User... user) throws SQLException {
        String sql = "insert into user(user_name,password) values(?,?)";
        Object[][] obj = new Object[user.length][];
        for (int i = 0; i < obj.length; i++) {
            obj[i]=new Object[]{user[i].getUser_name(),user[i].getPassword()};
        }
        return super.insertMore(con,sql,obj);
    }

    @Override
    public int deleteById(Connection con, String user_name) throws SQLException {
        String sql = "delete from User where user_name = ?";

        return super.delete(con,sql,user_name);
    }

    @Override
    public int updateById(Connection con, String user_name) throws SQLException {
        String sql = "update user set password=?  ";
        return super.update(con,sql,user_name);
    }

    @Override
    public ResultSet selectAllUser(Connection con,String user_name) throws SQLException {
        String sql = "select * from User where user_name=?";
        return super.select(con,sql,user_name);
    }

    @Override
    public ResultSet selectByLogin(Connection con,String user_name) throws SQLException {
        String sql = "select password from user where user_name=?";

        return super.select(con,sql,user_name);
    }

    @Override
    public ResultSet selectName(Connection con, String user_name) throws SQLException {
        String sql = "select user_name from user where user_name=?";
        return super.select(con,sql,user_name);
    }
}
