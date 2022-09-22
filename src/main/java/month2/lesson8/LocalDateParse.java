package month2.lesson8;

import java.time.LocalDate;

public class LocalDateParse {
    public static void main(String[] args) {
        String dateStr = "2015-11-05";
        LocalDate date = LocalDate.parse(dateStr);
        System.out.println(date);
    }
}
