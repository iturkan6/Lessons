package month2.lesson8;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoField;
import java.util.Date;

public class LocalDateFormat {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String dateString = date.format(DateTimeFormatter.ISO_DATE);
        System.out.println(dateString);

        LocalDate date1 = LocalDate.of(1995, 10, 5);
        String date1String = date1.format(DateTimeFormatter.ISO_DATE);
        System.out.println(date1String);
    }
}
