package Day0806.Test;

import java.io.*;

public class TestObjectInputStream {

    public void out(Object obj) throws IOException {
        //1:
        FileOutputStream file = new FileOutputStream("e:/obj.txt");
        ObjectOutputStream op = new ObjectOutputStream(file);
        //2:
        op.writeObject(obj);
        //3:
        op.close();
    }

    public  Object input(String path) throws IOException, ClassNotFoundException {
        //1:
        FileInputStream fos = new FileInputStream(path);
        ObjectInputStream oi = new ObjectInputStream(fos);
        //2:
        Object o = oi.readObject();
        //3:
        oi.close();
        return  o;
    }

    public static void main(String[] args) {
        TestObjectInputStream t = new TestObjectInputStream();
        Students s = new Students();
        s.setId("no.100");
        s.setName("忘初");
        s.setScore(100);
        try {
//            t.out(s);
            Object o = t.input("e:/obj.txt");
            System.out.println(o);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
