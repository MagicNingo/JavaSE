package Day0806.Test;

import java.io.*;
import java.util.Date;

public class TestPrintLog {
    public void log() throws IOException {
        //读
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(reader);

        //写
        FileWriter file = new FileWriter("E:/log.txt",true);
        PrintWriter pw = new PrintWriter(file);

        String str = null;
        System.out.println("请输入：");
        while((str = br.readLine()) != null) {
            if ("exit".equals(str)) {
                break;
            }
            System.out.println("你输入的话为："+str);

            //记录到日志文件
            pw.println(str);
            System.out.println("请输入：");
        }
        pw.println("输入时间为："+new Date());

        pw.close();
        br.close();
    }

    public static void main(String[] args) {
        TestPrintLog t = new TestPrintLog();
        try {
            t.log();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
