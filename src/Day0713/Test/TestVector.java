package Day0713.Test;

import Day0507.work.Student;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Vector;

public class TestVector {
    public static void main(String[] args) {
        Vector list = new Vector();/*Vector 类可以实现可增长的对象数组*/
        //增

        list.add(100);
        list.add(new Student("jack",20));
        list.add(10.21);
        list.add(true);
        list.add("你好！");
        list.add('你');

        //改
        list.set(2,21);
        /*System.out.println(list.get(2));*/

        //删
        list.remove(true);
        list.remove("你好！");
        list.remove(new Integer(100));

        //查

        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------------------------");

        for (Object o: list) {
            System.out.println(o);
        }

        System.out.println("------------------------------");

        //使用迭代器迭代

        Iterator it = list.iterator();
        while(it.hasNext()){
            Object o = it.next();
            System.out.println(o);
            it.remove();
        }
        System.out.println(list.size());
    }
}
