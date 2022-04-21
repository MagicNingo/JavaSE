package Day0805.Test;

import java.io.*;

//-------------------------字符流---------------------------------//
public class TestFileReader {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        BufferedReader bufferedReader = null;
        try {
            //1:建立管道,并确定流向
            //读出文件

            fileReader = new FileReader("E:\\AAA\\ccc.txt");

            //写出文件

            fileWriter = new FileWriter("E:\\bbb.txt");
            //2:使用管道

            int count = 0;
            int read = 0;
            while ((read = fileReader.read()) != -1) {
                count++;
                System.out.print((char) read);
                fileWriter.write(read);
            }
            System.out.println("一共读取" + count + "次！");

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (fileReader != null) {
                //3:关闭管道
                try {
                    fileReader.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fileWriter != null) {
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
