package Day0719.Test;

import Day0719.work.BaseDao;
import Day0719.work.Helper;
import Day0719.work.User;
import Day0719.work.UserDaoImp;
import org.junit.Test;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

public class TestOP {
    OperationAll op = new OperationAll();


    @Test
    public void three(){
        UserDaoImp daoImp = new UserDaoImp();
        Connection con = Helper.getConnection();
        User u1 = new User("张杰", "123456");
        User u2 = new User("张三", "123456");
        User u3 = new User("张四", "123456");
        try {
            int[] ints = daoImp.insertUsers(con, u1, u2, u3);
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            BaseDao dao = new BaseDao();
            dao.closeAll();
        }
    }


    @Test
    public void one() throws SQLException {
        int id =1;
        String name="C#";
        SchoolClass s = new SchoolClass(id,name);
        s.setClass_id(1);

        //int i = op.insert(new SchoolClass(name)); //增加
        //int i = op.update(s);//修改
        int i = op.delete(8);
        System.out.println(i);
    }

    @Test
    public void two() throws SQLException {
        /*List<SchoolClass> list = op.selectAll();
        for (SchoolClass sc: list) {
            System.out.println(sc);
        }*/

        int id = 2;
        String name="PHP";
        SchoolClass s = op.selectByLogin(new SchoolClass(id,name));
        System.out.println(s);

    }

    // 一次性添加多个
    public void insertMore(){
        SchoolClass[] s = new SchoolClass[3];
        SchoolClass s1 = new SchoolClass(5,"C语言");
        SchoolClass s2 = new SchoolClass(6,"数据库");
        SchoolClass s3 = new SchoolClass(7,"JSP");
    }

}
