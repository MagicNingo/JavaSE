package Day0527.work;

import java.util.ResourceBundle;

public class ClassHelp {
    public ResourceBundle bundle= ResourceBundle.getBundle("classLoad");
    public String name = bundle.getString("className");
    public String method = bundle.getString("methodName");

    public  Class  getClassName(){
        Class c = null;
        try {
            c = Class.forName(name);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        return c;
    }
}
