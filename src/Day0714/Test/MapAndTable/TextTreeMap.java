package Day0714.Test.MapAndTable;

import Day0713.work.Students;

import java.util.Set;
import java.util.TreeMap;
/*
TreeMap :
        1:键值对:底层是树型结构
        2:键不可以重复，还要实现了Comparable接口
        3:键不可以为null ;值可以为 null;
*/
public class TextTreeMap {
    public static void main(String[] args) {
        TreeMap map = new TreeMap();
        //--------增加--------------
        map.put("100",100);
        map.put("Hello,java","你好");
        map.put(false,'假');
        map.put(new Students("jack","1801",900),900.0);
        map.put("再见",new Students("Rose","1802",899));

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
