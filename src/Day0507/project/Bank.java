package Day0507.project;

public class Bank {
   private String bankName;
   private DataBase db;

    public Bank(String bankName) {
        this.bankName = bankName;
        db = new DataBase();
    }
//    银行提供相应功能的方法
/*------------------用户操作----------------- */
    //用户登录
    public boolean cusLogin(Customer c){
        return db.selectCusByLogin(c);
    }
    //用户存钱
    public boolean addMoney(String name , double money){
        return  db.addMoney(name,money);
    }
    //用户查看账户余额
    public Customer checkMoneyByName(String name){
        return db.checkMoneyByName(name);
    }
    //用户取钱
    public String outMoney(String name , double money){
        return db.outMoney(name,money);
    }
    //用户修改密码
    public boolean modifyPassword(Customer c){
        return  db.updatePassword(c);
    }
/*---------------管理员操作------------------ */
    //管理员登录
    public boolean adminLogin(Admin admin){

        return db.selectAdminByLogin(admin);
    }
//    显示所有用户
    public Customer[]  showAllCustomer(){
        return db.selectAllCus();
    }
//   注册用户
    public int addCustomer(Customer c) {
        return db.insertCus(c);
    }
//   修改用户信息
    public int modifyCustomer(Customer c){
        return db.updateCustomer(c);
    }
//   删除用户信息
    public String removeCusByName(String name){
       return   db.delCusByName(name);
    }
    public String getBankName() {
        return bankName;

    }

    public void setBankName(String bankName) {

        this.bankName = bankName;
    }

    public DataBase getDb() {

        return db;
    }

    public void setDb(DataBase db) {

        this.db = db;
    }
}
