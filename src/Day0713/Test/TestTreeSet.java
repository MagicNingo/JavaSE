package Day0713.Test;

import Day0713.work.Students;
import java.util.Iterator;
import java.util.TreeSet;
/*
TreeSet:
   1.TreeSet 会自动排序
   2.不能有重复数据
   3.有重复数据需要用到equals()和hashcode()方法
*/
public class TestTreeSet {
    public static void main(String[] args) {

        TreeSet list = new TreeSet();

        list.add(100);
        list.add(600);
        list.add(400);
        list.add(500);
        list.add(300);


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
