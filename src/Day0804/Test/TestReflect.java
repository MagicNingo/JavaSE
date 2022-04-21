package Day0804.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TestReflect {
    public static void main(String[] args) {
       /* //1:通过对象得到Class对象
        Human human = new Human();
        Class<? extends Human> c = human.getClass();
        //2:通过类得到
        Class<Human> h = Human.class;*/
        //3:通过Class类中的方法得到
        try {
            Class<?> c = Class.forName("Day0804.Test.Human");
            //Constructor<?> con = c.getConstructor();//得到公共的构造方法
            //得到任何权限的构造方法
            Constructor<?> con = c.getDeclaredConstructor(int.class);
            con.setAccessible(true);
            Object obj = con.newInstance(20);
            Field field = c.getDeclaredField("name");
            field.setAccessible(true);
            field.set(obj,"jack");

           /* Constructor[] d = c.getDeclaredConstructors();
            for (Constructor co: d) {
                System.out.println(co);
            }*/
            /*
            con.setAccessible(true);//为私有构造方法设置可以访问
            */
//            System.out.println(obj);
//            System.out.println(con);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchFieldException e) {
            e.printStackTrace();
        }
    }
}
