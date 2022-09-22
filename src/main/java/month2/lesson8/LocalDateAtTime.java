package month2.lesson8;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateAtTime {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 1, 13);
        LocalDateTime dateTime = date.atTime(1, 50, 9);
        System.out.println(dateTime);
    }
}
