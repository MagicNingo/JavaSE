package Day0507.work;

public class Exchange {
    int i ;
    int j ;

    public void exchange(int i , int j ){
        int temp = i;
        i= j;
        j = temp;
        System.out.println("i:"+i+"   j:"+j);
    }
    public void exchange(Exchange c1 , Exchange c2){
        Exchange temp = c1;
        c1 =c2;
        c2= temp;

    }
    public void exchange2(Exchange c1 , Exchange c2){

    }
    public static void main(String[] args) {
        int i =100;
        int j =10;
        Exchange e = new Exchange();
        e.exchange(i,j);
        System.out.println(i+" "+j);
    }
}
