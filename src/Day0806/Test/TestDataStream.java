package Day0806.Test;

import java.io.*;

public class TestDataStream {
    public ByteArrayOutputStream bos;

    public TestDataStream() {
        bos = new ByteArrayOutputStream();
    }

    public void out() throws IOException {
        DataOutputStream dos = new DataOutputStream(bos);
        dos.writeDouble(6.6);
        dos.writeBoolean(true);
        dos.writeInt(100);
        dos.close();
    }

    public void input() throws IOException {
        ByteArrayInputStream bis = new ByteArrayInputStream(bos.toByteArray());
        DataInputStream dis = new DataInputStream(bis);
        double d = dis.readDouble();
        boolean b = dis.readBoolean();
        int i = dis.readInt();
        System.out.println("1 :" + d);
        System.out.println("2 :" + b);
        System.out.println("3 :" + i);
        dis.close();
    }

    public static void main(String[] args) {
        TestDataStream t = new TestDataStream();
        try {
            t.out();
            t.input();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
