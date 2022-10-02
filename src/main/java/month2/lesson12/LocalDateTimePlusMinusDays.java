package month2.lesson12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimePlusMinusDays {
    public static void main(String[] args) {
        LocalDateTime dateTime1 = LocalDateTime.now();
        LocalDateTime dateTimeYesterday = dateTime1.minusDays(1);
        LocalDateTime dateTimeTomorrow = dateTimeYesterday.plusDays(2);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        String formatDateTime = dateTimeTomorrow.format(formatter);
        System.out.println(dateTimeYesterday);
        System.out.println(dateTime1);
        System.out.println(formatDateTime);
    }
}
