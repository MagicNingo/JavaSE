package Day0712.work2;

import java.io.IOException;
import java.util.Scanner;

public class TextException {

    public String input() {
        byte[] buf = new byte[50];
        try {
            System.in.read(buf);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new String(buf).trim();
    }

    public int check(int[] arr, int v) throws NumberNotFoundException {
        if (v < 0) {
            throw new NumberNotFoundException("输入的数值应该大于0！");
        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v) {
                return i;
            }
        }
        throw new NumberNotFoundException("数值没有找到！");
    }

    public void checkDbValue(int[] arr , int v) throws DuplicateValueException {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == v) {
                throw new DuplicateValueException("数值已经存在!");
            }
        }
    }

    public static void main(String[] args) {
        NumberNotFoundException myException = new NumberNotFoundException("数字没有找到！");
        myException.getMessage();

        TextException t = new TextException();
        Scanner s = new Scanner(System.in);
        int[] a = new int[5];
        int v = 0;
        for (int i = 0; i < a.length; i++) {
            System.out.println("请输入" + i + "号位置的值：");
            try {
                v = s.nextInt();
                t.checkDbValue(a,v);
                a[i] = v;
            } catch (NumberFormatException e) {
                i--;
                System.out.println("只能输入整型变量！");
            } catch (DuplicateValueException e) {
                i--;
                System.out.println(e.getMessage());
            }
        }
        boolean f = true;
        int value = -1;
        int index = -1;
        while (f) {
            System.out.println("请输入想要进行的操作：1.输入索引找元素的值  2.输入值找元素的索引 3.退出");
            String st = t.input();
            try {
                if ("1".equals(st)) {
                    System.out.println("请输入索引值：");
                    index = Integer.parseInt(t.input());
                    System.out.println(index + "号位置的值是" + a[index]);

                } else if ("2".equals(st)) {
                    System.out.println("请输入元素的值：");
                    value = Integer.parseInt(t.input());
                    index = t.check(a, value);
                    System.out.println(value + "在数组的" + index + "号位置！");

                } else if ("3".equals(st)) {
                    f = false;

                } else {
                    System.out.println("请输入正确的选项！");
                }

            } catch (NumberFormatException e) {
                System.out.println("只能输入整型变量！");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("数组越界！");
            } catch (NumberNotFoundException e) {
                System.out.println(e.getMessage());
            } catch (Exception e) {
                e.printStackTrace();
                System.out.println("未知错误！");
            }


        }
    }
}
