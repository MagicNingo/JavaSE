package Day0712.Test;

import java.io.IOException;

public class SkyeDuException {
    public String input(){
        byte[] buf = new byte[50];
        try {
            System.in.read(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(buf).trim();
    }
    public static void main(String[] args) {
        SkyeDuException sk = new SkyeDuException();
        boolean f = true;
        while(f) {
            System.out.println("请输入被除数：");
            String str = sk.input();
            try {
                int i = Integer.parseInt(str);
                int a = 0;
                System.out.println(i / a);
            } catch (ArithmeticException e) {
                System.out.println("除数不能是0!");
            } finally {
                System.out.println("请输入非0除数！");
            }
        }
    }
}
