package Day0714.Test.List;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;


public class MyList<T> {

    public static void main(String[] args) {
        /*ArrayList<Student> list = new ArrayList<>();
        list.add(new Student("wan",22));
        list.add(new Student("rose",20));
        list.add(new Student("jack",24));
        list.add(new Student("zhang",23));
        Collections.sort(list);//要想使用此方法 Student这个类必须继承Comparable<? super T>
        for (Student o: list) {
            System.out.println(o.getName());
        }*/
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 1000; i++) {
            list.add(i);
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }

        long l1 = System.currentTimeMillis();
        list.add(99, 2);
        long l2 = System.currentTimeMillis();
        System.out.println(l2-l1);

    }


}
