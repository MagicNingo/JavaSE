package Day0507.Test;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TestAirPlan {
    public static void main(String[] args) {
        /*AirPlan airPlan1 = new AirPlan();
        AirPlan airPlan2 = new AirPlan("9091","波音747");

        airPlan1.fly();
        airPlan1.takePeople();
        airPlan1.setId("9001");
        airPlan1.getId();
        airPlan2.setType("歼-11战斗机");
        System.out.println(airPlan1);
        System.out.println(airPlan2);*/

        LocalDateTime now = LocalDateTime.now();
        String time = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        System.out.println(time);

    }
}
