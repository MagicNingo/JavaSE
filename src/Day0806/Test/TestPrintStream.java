package Day0806.Test;

import org.junit.Test;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.PrintWriter;

public class TestPrintStream {
    @Test
    public void testStream() throws FileNotFoundException {
        //PrintStream printStream = new PrintStream("E:/print.txt");
        PrintWriter writer = new PrintWriter("E:/write.txt");
        for (int i = 0; i <= 655; i++) {
            writer.print((char) i + "  ");
            if (i % 30 == 0) {
                writer.println();
            }
            writer.flush();
        }
        writer.close();
        /*//重定向
        PrintStream p = System.out;
        System.setOut(printStream);
        for (int i = 0; i <=655 ; i++) {
            System.out.print((char)i + " ");
            if (i%100 == 0) {
                System.out.println();
            }
        }
        //使用完之后，把系统的打印流设回来
        System.setOut(p);
        System.out.println("___end___");
        printStream.close();*/

    }
}
