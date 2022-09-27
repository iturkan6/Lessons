package month2.lesson10;

import java.time.LocalTime;

public class LocalTimeMinus {
    public static void main(String[] args) {
        LocalTime time = LocalTime.of(10, 43, 12);
        System.out.println(time);
        LocalTime time1 = time.minusHours(2);
        System.out.println(time1);
        LocalTime time2 = time.plusHours(2);
        System.out.println(time2);

        LocalTime time3 = time.plusMinutes(2);
        System.out.println(time3);
        LocalTime time4 = time.minusMinutes(2);
        System.out.println(time4);


        LocalTime time5 = time.plusSeconds(2);
        System.out.println(time5);
        LocalTime time6 = time.minusSeconds(2);
        System.out.println(time6);
    }
}
