package Day0714.Test.List;

import Day0713.work.Students;


import java.util.ArrayList;
import java.util.Collections;

public class TestArrayListSort {
    public static void main(String[] args) {
/*
    <T extends Comparable<? super T>>  T这个类必须继承Comparable这个类
*/
        ArrayList<Students> list = new ArrayList<>();

        list.add(new Students("AAA","20"));
        list.add(new Students("BBB","22"));
        list.add(new Students("DDD","19"));
        list.add(new Students("CCC","21"));

        /*MySort mySort = new MySort("Id", "降序");
        Collections.sort(list,mySort);*/

        Collections.sort(list);//要想使用此方法 Students这个类必须继承Comparable<? super T>
        for (Students students : list) {
            System.out.println(students);
        }
    }
}
