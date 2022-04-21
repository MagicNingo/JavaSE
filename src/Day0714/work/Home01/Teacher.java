package Day0714.work.Home01;

import Day0714.work.Home01.OutPrinter;

public class Teacher implements OutPrinter {
    private String name;


    public Teacher(String name) {
        this.name = name;
    }

    public Teacher() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String detail() {
        return "打印"+name+"老师信息！";
    }
}
