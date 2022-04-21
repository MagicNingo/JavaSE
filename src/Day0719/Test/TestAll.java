package Day0719.Test;

import Day0719.work.BaseDao;
import com.mysql.cj.jdbc.Driver;

import java.sql.DriverManager;
import java.sql.SQLException;

public class TestAll {
    public static void main(String[] args) {
        OperationAll op = new OperationAll();
        SchoolClass s = new SchoolClass(8,"Python");
        try {
            op.insert(s);
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            BaseDao dao = new BaseDao();
            dao.closeAll();
        }
    }
}
