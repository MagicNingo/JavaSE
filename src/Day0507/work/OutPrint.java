package Day0507.work;

public class OutPrint {



        public void print(int x) {
            for (int i = 0; i < x; i++) {
                System.out.println(i);
            }
        }

        public void print(int x,int y) {
            for (int i = x; i < y; i++) {
                System.out.println(i);
            }
        }

        public void print(int x,int y,int z) {
            for (int i = x; i < y; i++) {
                System.out.println(i);
                i = i + z;
            }
        }


}
