package Day0806.Test;

import java.io.*;

public class TestChangStream {
    public static void main(String[] args) {
        try {
            //现在都是第一步
            FileInputStream inputStream = new FileInputStream("E:/bbb.txt");
            //字节流转成字符流
            InputStreamReader reader = new InputStreamReader(inputStream);
            // 缓冲流改装
            BufferedReader bf = new BufferedReader(reader);

            FileOutputStream outputStream = new FileOutputStream("E:/ccc.txt");
            OutputStreamWriter writer = new OutputStreamWriter(outputStream);
            BufferedWriter bw = new BufferedWriter(writer);

            String str = null;
            while((str = bf.readLine()) != null){
                System.out.println(str);
                bw.write(str);
                bw.newLine();
                bw.flush();
            }
            bf.close();
            bw.close();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
