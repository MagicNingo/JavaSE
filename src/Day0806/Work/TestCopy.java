package Day0806.Work;

import java.io.*;

public class TestCopy {
    public void getFileName(File file , String path) throws IOException {
        if (file.isDirectory()) {
            String newPath = path + "/" + file.getName();
            new File(newPath).mkdirs();
            File[] arr = file.listFiles();
            for (File f : arr) {
                getFileName(f, newPath);
            }

        } else if (file.isFile()) {
            copyFiles(path + "/" + file.getName(), file.getPath());
        }

    }

    public void copyFiles(String newPath,String oldPath) throws IOException {
        FileInputStream inputStream = new FileInputStream(oldPath);
        InputStreamReader reader = new InputStreamReader(inputStream);
        BufferedReader bf = new BufferedReader(reader);

        FileOutputStream outputStream = new FileOutputStream(newPath);
        OutputStreamWriter writer = new OutputStreamWriter(outputStream);
        BufferedWriter bw = new BufferedWriter(writer);

        String str = null;
        while((str = bf.readLine()) != null){
            bw.write(str,0,str.length());
            bw.newLine();
            bw.flush();
        }
        bf.close();
        bw.close();
    }

    public static void main(String[] args) {
        TestCopy copy = new TestCopy();
        File file = new File("e:/AAA");
        try {
            copy.getFileName(file, "d:");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
