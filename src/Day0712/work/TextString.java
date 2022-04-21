package Day0712.work;

import java.io.IOException;

public class TextString {
    public String input(){
        byte[] buf = new byte[50];
        try {
            System.in.read(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(buf).trim();
    }
    public void checkString(String str) throws InvalidInputException, IncludeNumberException {
        if(str.trim().equals("")){
            throw new InvalidInputException();
        }
        char[] a = str.toCharArray();
        for (int i = 0; i < a.length; i++) {
            if (a[i]>='1'&&a[i]<='9') {
                throw new IncludeNumberException();
            }
        }
    }

    public static void main(String[] args) {
        TextString t = new TextString();
        boolean f =true;
        while (f){
            System.out.println("请输入一串字符：");
            String s = t.input();
            try {
                t.checkString(s);
                System.out.println("输入的字符串为：");
                System.out.println(s);
            } catch (InvalidInputException e) {
                System.out.println(e.getMessage());
            } catch (IncludeNumberException e) {
                System.out.println("字符串包含数字!");
            }
        }
    }
}
