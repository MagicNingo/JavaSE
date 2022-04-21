package Day0804.Test;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class TestReflectList {
    public static void main(String[] args) {
        Human human = new Human();
        human.id = "No.999 ";
        ArrayList<String> list = new ArrayList<>();
        list.add("hello");
        list.add("java");
        list.add("web");
        //可以使用反射技术，绕过泛型。实现泛型擦除
        // 实现向这个list里写入一个Human对象

        // 1:使用反射技术得到list的add方法，
        try {
            Class<? extends ArrayList> c = list.getClass();
            Method m = c.getDeclaredMethod("add", Object.class);
            //2:再调用这个方法，把Human对象写进去。
            m.invoke(list, human);
            // 3:遍历list
            for (Object o: list) {
                System.out.println(o);
            }
        }  catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }





    }
}
