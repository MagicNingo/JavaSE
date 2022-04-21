package Day0507.work;

public class ClassRoom {
    private String name;
    private int num;
    private Student[] stu;

    public ClassRoom() {}

    public ClassRoom(String name, int num) {
        this.name = name;
        this.num = num;
        stu = new Student[num];
    }
    //显示学生的信息
    public void showInfo(){
        for (Student s: stu) {
            System.out.println(s);
        }
    }
    //一次性进入多个学生的方法
    public void getInfoMore(Student... ss){
        //可变参数，以数组的形式存在： Student...
        int j=0;
        for (int i = 0;i<stu.length && j<ss.length;i++){
            if (stu[i] == null) {
                stu[i] = ss[j];
                j++;
            }
        }
        if (j < ss.length) {
            for (int i = j; i < ss.length ; i++) {
                System.out.println("还有"+ss[i]+"没进教室！");
            }

        }
    }
//提供学生进教室的方法
    public void  getInfo(Student s){
        for (int i = 0;i<stu.length ;i++) {
            if (stu[i] == null) {
                stu[i] = s;
                break;
            }
        }
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public Student[] getStu() {
        return stu;
    }

    public void setStu(Student[] stu) {
        this.stu = stu;
    }


}
