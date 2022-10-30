package month2.lesson12;

import month2.lesson8.LocalDateFormat;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class LocalDateTimeNow {
    public static void main(String[] args) {
        LocalDateTime dateTime = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH.mm");
        String formatDateTime = dateTime.format(formatter);
        System.out.println(formatDateTime);
    }
}
