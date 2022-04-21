package Day0713.work;

import java.util.Iterator;
import java.util.Stack;

public class CheckStack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(new Rock("琥珀"));
        s.push(new Rock("水晶"));
        s.push(new Rock("玉石"));

        Object o1 = s.pop();//拿出第一个;
        Object o2 = s.pop();//拿出第二个;

        s.push(o1);

        Iterator it = s.iterator();
        while(it.hasNext()){
            Rock o = (Rock)it.next();
            System.out.println(o.getName());
        }
    }
}
