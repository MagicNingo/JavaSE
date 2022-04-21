package Day0507.Test;

import java.util.Arrays;

public class DateTest {
    public static void main(String[] args) {

        AirPlan[] arr = new AirPlan[5];

        arr[0] = new AirPlan("2","A");
        arr[1] = new AirPlan("2","B");
        arr[2] = new AirPlan("3","D");
        arr[3] = new AirPlan("2","C");
        arr[4] = new AirPlan("1","E");

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
