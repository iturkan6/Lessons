package month2.lesson10;

import java.time.ZoneId;
import java.time.temporal.ChronoUnit;

public class LocalTime {
    public static void main(String[] args) {
        ZoneId zone = ZoneId.of("Asia/Tokyo");
        java.time.LocalTime time = java.time.LocalTime.now(zone);
        System.out.println(time);

        ZoneId zone2 = ZoneId.of("Asia/Baku");
        java.time.LocalTime time2 = java.time.LocalTime.now(zone2);
        System.out.println(time2);

        Long hours = ChronoUnit.HOURS.between(time, time2);
        System.out.println(hours);


    }
}
