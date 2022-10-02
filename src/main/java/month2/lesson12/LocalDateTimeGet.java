package month2.lesson12;

import java.time.LocalDateTime;
import java.time.temporal.ChronoField;

public class LocalDateTimeGet {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.of(2015, 10, 20, 15, 50);
        System.out.println(dateTime.get(ChronoField.DAY_OF_WEEK));
        System.out.println(dateTime.get(ChronoField.DAY_OF_YEAR));
        System.out.println(dateTime.get(ChronoField.DAY_OF_MONTH));
        System.out.println(dateTime.get(ChronoField.HOUR_OF_DAY));
        System.out.println(dateTime.get(ChronoField.MINUTE_OF_DAY));
    }
}
