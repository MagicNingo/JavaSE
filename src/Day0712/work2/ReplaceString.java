package Day0712.work2;

import java.util.Scanner;

public class ReplaceString {

        public void replace(String str) {
                if (str.contains("sb")){
                        System.out.println("字符串含有不健康字符必须替换，替换后的字符为：");

                        char[] a = str.toCharArray();
                        for (int i = 0; i<a.length; i++ ) {
                                if(a[i]=='s'&&a[i+1]=='b') {
                                        a[i] = '*';
                                        a[i+1]='*';
                                }
                        }
                        for (int j = 0; j<a.length; j++){
                                System.out.print(a[j]);
                        }
                }else {
                        System.out.println("字符串不需要进行替换：");
                        System.out.println(str);
                }
        }

        public static void main(String[] args) {
                ReplaceString r = new ReplaceString();
                String str ;
                Scanner scanner = new Scanner(System.in);
                System.out.println("请输入字符串：");
                str = scanner.nextLine();
                r.replace(str);


        }
}
