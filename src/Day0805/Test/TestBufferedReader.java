package Day0805.Test;

import java.io.*;

public class TestBufferedReader {
    public static void main(String[] args) {
        FileReader fileReader = null;
        FileWriter fileWriter = null;
        BufferedReader bf = null;
        BufferedWriter bw = null;
        try {
            //1:建立管道,并确定流向
            //读出文件

            fileReader = new FileReader("E:\\AAA\\CCC.txt ");
            bf = new BufferedReader(fileReader);

            //写出文件
            fileWriter = new FileWriter("E:\\bbb.txt");
            bw = new BufferedWriter(fileWriter);

            //2:使用管道
            int count = 0;
            String read = null;
            while ((read = bf.readLine()) != null) {
                count++;
                System.out.println(read);
                bw.write(read);
                bw.flush();
                bw.newLine();
            }
            bf.close();
            bw.close();

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
                //3:关闭管道
                try {
                    fileWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
