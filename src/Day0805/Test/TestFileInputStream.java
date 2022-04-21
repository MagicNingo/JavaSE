package Day0805.Test;

import java.io.*;

//-------------------------字节流----------------------------------//
public class TestFileInputStream {
    public static void main(String[] args) {
        FileInputStream inputStream = null;
        FileOutputStream outputStream = null;
        try {
            //1:建立管道,并确定流向
            //读出文件
            File file = new File("E:\\AAA\\ccc.txt");
            inputStream = new FileInputStream(file);

            //写出文件
            File f = new File("E:\\aaa.txt");
            outputStream = new FileOutputStream(f);


            //2:使用管道
            int count = 0;
            int read = 0;
            while ((read = inputStream.read()) != -1) {
                count++;
                System.out.print((char) read);
                outputStream.write(read);
            }
            System.out.println("一共读取" + count + "次！");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (inputStream != null) {
                //3:关闭管道
                try {
                    inputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (outputStream != null) {
                try {
                    outputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
