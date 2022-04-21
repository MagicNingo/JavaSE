package Day0805.Test;

import Day0719.Test.Time.TimeUtil;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TestFile {
    public static void main(String[] args) {
        File file = new File("E:/AAA/BBB/DDD/EEE");

       /* MyFile myFile = new MyFile();
        File[] files = file.listFiles();
        //File[] files = file.listFiles(myFile);
        for (File f: files) {
            System.out.println(f);
        }*/
        /*boolean delete = file.delete();//删除文件或目录
        System.out.println(delete);*/

        boolean mkdirs = file.mkdirs();
        System.out.println(mkdirs);

        /*try {
            boolean f = file.createNewFile();//创建新的文件
            System.out.println(f);
        } catch (IOException e) {
            e.printStackTrace();
        }*/

       /* boolean mkdir = file.mkdir();//创建目录
        System.out.println(mkdir);*/
        /*long time = file.lastModified();
        Date date = new Date(time);
        SimpleDateFormat sd = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String s = sd.format(date);
        System.out.println(s);*/
    }
}
