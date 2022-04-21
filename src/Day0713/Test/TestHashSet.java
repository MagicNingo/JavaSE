package Day0713.Test;

import Day0507.work.Student;

import java.util.HashSet;
import java.util.Iterator;
/*
HashSet:
   1.set是无序的(TreeSet 会自动排序)
   2.不能有重复数据
   3.有重复数据需要用到equals()和hashcode()方法
*/
public class TestHashSet {
    public static void main(String[] args) {

        HashSet list = new HashSet();

        list.add(100);
        list.add(new Student("jack",20));
        list.add(10.21);
        list.add(true);
        list.add("你好！");
        list.add('你');
        list.add(new Student("jack",10));

        //改
        //list.set(2,20);


        //删
       /* list.remove(true);
        list.remove("你好！");
        list.remove(new Integer(100));*/

        //查

        /*for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("----------------------------");

        for (Object o: list) {
            System.out.println(o);
        }

        System.out.println("------------------------------");*/

        //使用迭代器迭代

        Iterator it = list.iterator();
        while(it.hasNext()){
            Object o = it.next();
            System.out.println(o);
            //it.remove();
        }
        System.out.println(list.size());

    }
}
