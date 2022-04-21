package Day0527.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class TextHuman {

    public Class getMyClass() throws ClassNotFoundException {
        Class c = Class.forName("Day0527.Test.Human");
        return c;
    }

    public void constructor() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {

        Class c = getMyClass();

        //得到公共的构造方法
        Constructor con = c.getConstructor();

        /*Constructor[] d = c.getDeclaredConstructors();//得到所有类型的构造方法
        for (Constructor co : d) {
            System.out.println(co);
        }

        System.out.println(con);*/


        /*
        //得到有参数的构造方法
        Constructor con1 = c.getDeclaredConstructor(String.class);
        System.out.println(con1);
        Object obj = con1.newInstance("jack");
        System.out.println(obj);


        //得到私有的构造方法
        Constructor con2 = c.getDeclaredConstructor(int.class);
        System.out.println(con2);
        con2.setAccessible(true);
        Object bj = con2.newInstance(22);
        System.out.println(bj);*/

    }

    public void textFiled() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException, NoSuchFieldException {
        Class c = getMyClass();
        Constructor con = c.getConstructor();
        Object o = con.newInstance();
        Field f = c.getDeclaredField("name");
        //c.getDeclaredFields();//得到本类的所有属性,不能得到从父类继承的属性
        f.setAccessible(true);
        f.set(o, "jack");
        System.out.println(o);
    }

    public void textMethod() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        Class c = getMyClass();
        Constructor con = c.getConstructor();
        Object obj = con.newInstance();

        Method method = c.getDeclaredMethod("breath", String.class);
       /*
        Method[] m = c.getDeclaredMethods();//得到所有权限的方法,不包括继承的方法
        for (Method co: m) {
            System.out.println(co);
        }*/
        method.setAccessible(true);
        method.invoke(obj, "hello");

    }


    public static void main(String[] args) {
        TextHuman t = new TextHuman();
        try {
            //t.textFiled();
            t.textMethod();
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
        }
    }
}
