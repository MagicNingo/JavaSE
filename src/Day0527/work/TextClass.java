package Day0527.work;


import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ResourceBundle;

public class TextClass {
    public Class one() throws ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InvocationTargetException, InstantiationException {
        ResourceBundle bundle = ResourceBundle.getBundle("classLoad");
        String name = bundle.getString("className");
        String method = bundle.getString("methodName");

        Class c = Class.forName(name);
        return c;
    }
    public void constructor() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class cc = one();
        Constructor con = cc.getDeclaredConstructor(String.class);
        Object obj = con.newInstance("jack");

        System.out.println(obj);
    }


    public void textMethod()  {
        ResourceBundle bundle = ResourceBundle.getBundle("classLoad");
        String className= bundle.getString("className");
        String methodName = bundle.getString("methodName");

        try {
            Class c = Class.forName(className);
            Constructor con = c.getDeclaredConstructor();
            con.setAccessible(true);
            Object obj = con.newInstance();
            Method[] m = c.getDeclaredMethods();
            Class[] types = null;
            for (int i = 0; i < m.length; i++) {
                String name = m[i].getName();
                if(methodName.equals(name)) {
                    System.out.println("得到的方法为"+name);
                    types = m[i].getParameterTypes();
                    for (Class t : types) {
                        System.out.println("方法的参数类型为"+t.getName());
                    }
                }
            }
            if (types.length == 0) {
                Method method = c.getDeclaredMethod(methodName);
                method.setAccessible(true);
                method.invoke(obj);
            } else {
                Method method = c.getDeclaredMethod(methodName,types);
                method.setAccessible(true);
                method.invoke(obj,"hello");
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }

    }

    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        TextClass t = new TextClass();
        t.constructor();


    }
}
