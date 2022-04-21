package Day0507.Test;

import org.junit.Test;

public class YangHuiTest {
    @Test
    public  void test01() {
        int[][] ints = new int[10][];
        for (int i = 0; i < ints.length; i++) {
            ints[i] = new int[i + 1];

            ints[i][0] = ints[i][i] = 1;
            if (i > 1) {
                for (int j = 1; j < ints[i].length - 1; j++) {
                    ints[i][j] = ints[i - 1][j - 1] + ints[i - 1][j];
                }
            }
        }

        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                System.out.print(ints[i][j] + " ");
            }
            System.out.println();
        }
    }

    @Test
    public void test02() {
        int[] ints = new int[10];

        for (int i = 0; i < ints.length; i++) {
            if (i < 1) {
                ints[i] = ints[i+1] = 1;
            }

            if (i>1) {
                ints[i] = ints[i-1] + ints[i-2];
            }
        }

        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + " ");
        }
    }


    @Test
    public void test03() {
        for(int i=0;i<10;i++) {
            long num = fibonacci(i);
            System.out.print(num+" ");
        }
    }

    long fibonacci(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return fibonacci(n-2) + fibonacci(n-1);
        }
    }
}
