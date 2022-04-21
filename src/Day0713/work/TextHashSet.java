package Day0713.work;

import java.util.HashSet;
import java.util.Iterator;

public class TextHashSet {
    public static void main(String[] args) {
        HashSet set = new HashSet();
        set.add(new Rock("大理石"));
        set.add(new Rock("云纹石"));
        set.add(new Rock("翡翠"));

        Iterator it = set.iterator();

        while(it.hasNext()){
            Rock o = (Rock)it.next();
            System.out.println(o.getName());
        }
    }
}
