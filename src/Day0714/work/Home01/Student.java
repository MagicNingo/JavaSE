package Day0714.work.Home01;

import Day0714.work.Home01.OutPrinter;

public class Student implements OutPrinter {
    private String name;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String detail() {
        return "打印"+name+"学生的信息！";
    }
}
