package Day0714.Test.MapAndTable;

import Day0713.work.Students;

import java.util.HashMap;
import java.util.Set;

public class TextHashMap {
    public static void main(String[] args) {
        HashMap map = new HashMap();
        //--------增加--------------
        map.put("100",100);
        map.put("Hello,java","你好");
        map.put(false,'假');
        map.put(new Students("jack","1801",900),900.0);
        map.put("再见",new Students("Rose","1802",899));
        map.put(null,null);

        //--------查询--------------
        //Object o = map.get("100");
        //Object o = map.get("Hello,java");
        //Object o = map.get(new Students("jack","1801",900));
        //System.out.println(o);

        //--------修改--------------
        map.replace("100","再见吧！");

        //--------删除--------------
        map.remove("100");

        //--------遍历--------------
        Set set = map.keySet();
        for (Object o: set) {
            System.out.println(o+"----->"+map.get(o));
        }



    }
}
