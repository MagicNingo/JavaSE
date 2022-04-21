package Day0713.Test;

import Day0507.work.Student;

import java.util.Stack;

//Stack 类表示后进先出（LIFO）的对象堆栈
public class TestStack {
    public static void main(String[] args) {
        Stack list = new Stack();

        list.push("hello,java!");
        list.push(100);
        list.push(new Student("rose",20));

        System.out.println(list.get(0));

        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));

        }

        /*System.out.println("------------------------");
        boolean b = list.empty();
        System.out.println(b);*/


        System.out.println("------------------------");
        Object o = list.peek(); /*peek():查看堆栈顶部的对象，但不从堆栈中移除它。*/
        System.out.println(o);



        System.out.println("------------------------");
        Object pop = list.pop();  /*pop():移除堆栈顶部的对象，并作为此函数的值返回该对象。*/
        System.out.println("移除的是："+pop);
        System.out.println();
        for (int i = 0; i <list.size(); i++) {
            System.out.println(list.get(i));
        }

        System.out.println();
        System.out.println("-------------------------");
        /*search(Object o) 返回对象在堆栈中的位置，以 1 为基数。*/
        int search = list.search(100);
        System.out.println(search);
    }
}
