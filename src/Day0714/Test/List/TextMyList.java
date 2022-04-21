package Day0714.Test.List;

import java.util.ArrayList;
import java.util.List;

public class TextMyList {
    public static void main(String[] args) {
        List<?> f = null;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(99);
        list.add(33);
        f = list;
        for (Object o : f) {
            System.out.println(o);
        }
        System.out.println(" ----------------------------");
        List<Number> ff = null;
        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(222);
        list2.add(567);
        list2.add(111);

        //ff=list2; /*泛型不协变*/

    }
}