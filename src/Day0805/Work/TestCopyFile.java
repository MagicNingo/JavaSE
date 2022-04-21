package Day0805.Work;

import java.io.*;

public class TestCopyFile {

    public void checkFile(File file , String path) throws IOException {
        if (file.isDirectory()) {

            String newPath = path + "/" + file.getName();
            System.out.println("newPath:"+newPath);
            new File(newPath).mkdirs();
            File[] files = file.listFiles();
            for (File f : files) {
                checkFile(f,newPath);
            }
        } else {
            System.out.println(file.getName());
            copyFile(path +"/"+ file.getName(), file.getPath());
        }
    }

    public void copyFile(String newPath, String oldPath) throws IOException {
        FileInputStream fis = new FileInputStream(oldPath);
        BufferedInputStream bis = new BufferedInputStream(fis);

        FileOutputStream fos = new FileOutputStream(newPath);
        BufferedOutputStream bos = new BufferedOutputStream(fos);

        byte[] buf = new byte[1024];
        int len = 0;
        while ((len = bis.read(buf)) != -1) {
            bos.write(buf,0,len);

        }
        bis.close();
        bos.flush();
        bos.close();
    }

    public static void main(String[] args) {
        TestCopyFile t = new TestCopyFile();
        try {
            t.checkFile(new File("E:/AAA"),"d:");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
