package Day0720.work;

import java.util.Date;

public class Admin {
    private Integer admin_id;
    private String admin_name;
    private String admin_password;
    private Date  date;
    private Integer roleId;

    public Admin() {
    }

    public Admin(Integer admin_id, String admin_name,
           String admin_password, Date date, Integer roleId) {
        this.admin_id = admin_id;
        this.admin_name = admin_name;
        this.admin_password = admin_password;
        this.date = date;
        this.roleId = roleId;
    }

    public Integer getAdmin_id() {
        return admin_id;
    }

    public void setAdmin_id(Integer admin_id) {
        this.admin_id = admin_id;
    }

    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name;
    }

    public String getAdmin_password() {
        return admin_password;
    }

    public void setAdmin_password(String admin_password) {
        this.admin_password = admin_password;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public String toString() {
        return "Admin{" +
                "admin_id=" + admin_id +
                ", admin_name='" + admin_name + '\'' +
                ", admin_password='" + admin_password + '\'' +
                ", date=" + date +
                ", roleId=" + roleId +
                '}';
    }
}
