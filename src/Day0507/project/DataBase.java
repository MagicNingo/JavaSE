package Day0507.project;

public class DataBase {
    private final Customer[] cus;
    private final Admin[] admins;

    public DataBase() {
        cus = new Customer[10];
        admins = new Admin[6];
        cus[0] = new Customer("王一","123456");
        cus[1] = new Customer("汪风","456789");
        cus[3] = new Customer("刘琦","456789",18090,"18093003712");
        admins[0] = new Admin("admin","admin");
    }
/*-------------用户相关操作----------------------*/
    //用户登录
    public boolean selectCusByLogin(Customer c){
        for(int i=0;i< cus.length;i++){
            if(cus[i] != null&&cus[i].getUserName().equals(c.getUserName())&&cus[i].getPassword().equals(c.getPassword())){
                 return true;
            }
        }
        return false;
    }
    //用户存钱
    public boolean addMoney(String name , double money){
        for(int i=0;i< cus.length;i++){
            if(cus[i] !=null && money>0 && cus[i].getUserName().equals(name)){
                cus[i].setMoney(cus[i].getMoney()+money);
                return true;
            }
        }
        return  false;
    }
    //查看账户余额
    public  Customer checkMoneyByName(String name){
        for(int i=0;i< cus.length;i++){
            if(cus[i] !=null && cus[i].getUserName().equals(name)){
                return cus[i];
            }
        }
        return null;
    }
    //取钱
    public String outMoney(String name , double money){
        for(int i=0;i< cus.length;i++){
            if(cus[i] !=null && cus[i].getUserName().equals(name)){
                if (cus[i].getMoney()>=money) {
                    cus[i].setMoney(cus[i].getMoney()-money);
                    return "取款成功";
                }else{
                    return "余额不足";
                }
            }
        }
        return "取款失败,请联系管理员";
    }
    //修改用户密码
    public Boolean updatePassword(Customer c){
        for(int i=0;i< cus.length;i++){
            if(cus[i] !=null && cus[i].getUserName().equals(c.getUserName())){
                cus[i].setPassword(c.getPassword());
                return true;
            }
        }
        return  false;
    }
/*---------------------管理员相关操作------------------*/
   //管理员登录
    public boolean selectAdminByLogin(Admin admin){
        for(int i=0;i<admins.length;i++){
            if(admins[i] != null&&admins[i].getName().equals(admin.getName())&&admins[i].getPassword().equals(admin.getPassword())){
                return true;
            }
        }
        return false;
    }
//    显示所有用户
    public Customer[] selectAllCus(){
        return cus;
    }
    //新增用户
    public int insertCus(Customer c){
       boolean f = checkName(c.getUserName());
       if(!f) {
           for (int i = 0; i < cus.length; i++) {
               if (cus[i] == null) {
                   cus[i] = c;
                   return 1;
               }
           }
       }else {
           return -1;
       }
           return 0;
    }
    //检查是否有重名用户
    public boolean checkName(String name) {
        for (int i = 0; i < cus.length; i++) {
            if (cus[i] != null && cus[i].getUserName().equals(name)) {
                return true;
            }
        }
        return false;
    }
    //修改用户信息
    public int updateCustomer(Customer c){
        int p = 0;
        int t = 0;
        boolean f = false;
        for ( int i=0; i<cus.length; i++){

            if (cus[i] !=null && cus[i].getUserName().equals(c.getUserName())){
                if (c.getPassword() !=null){
                      cus[i].setPassword(c.getPassword());
                      p=1;
                }
                if (c.getTel() !=null){
                    cus[i].setTel(c.getTel());
                    t=1;
                }
                f= true;
                break;
            }
        }
        if (p ==1 || t==1){
            return 1;
        }else if (!f){
            return -1;
        }
        return 0;
    }
    //删除用户信息
    public String delCusByName(String name){
        for (int i=0; i<cus.length; i++){
            if (cus[i] !=null && cus[i].getUserName().equals(name)){
                if (cus[i].getMoney() == 0) {
                    cus[i] = null;
                    return "删除用户信息成功!";
                }else{
                    return "用户还有余额,无法删除用户信息!";
                }
            }
        }
        return "该用户不存在!";
    }

    public Customer[] getCus() {
        return cus;
    }

    public Admin[] getAdmins() {
        return admins;
    }




}
