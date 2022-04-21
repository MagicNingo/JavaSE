package Day0714.work.season;

public class TextSeason {
    public static void main(String[] args) {
        Season spring = Season.SPRING;
        Season summer = Season.SUMMER;
        Season fall = Season.FALL;
        Season winter = Season.WINTER;



        spring.view();

        Season[] seasons = Season.values();
        Season value = Season.valueOf("SPRING");

        for (Season season : seasons) {
            System.out.println(season);
        }
        System.out.println(value);



    }
}
