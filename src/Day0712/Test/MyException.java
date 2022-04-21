package Day0712.Test;

import java.io.IOException;

public class MyException {
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
        MyException me = new MyException();
        boolean f = true;

        while(f) {
            System.out.println("请输入一串字符:");
            String in = me.input();
            char[] chars = in.toCharArray();

            System.out.println("请输入索引值:");
            String s = me.input();
            try {
                int index = Integer.parseInt(s);
                System.out.println(chars[index]);
            } catch (NumberFormatException e) {
                System.out.println("对不起索引值只能输入数字！");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("对不起索引值不能超过数组的范围！");
            }
        }

    }
}
