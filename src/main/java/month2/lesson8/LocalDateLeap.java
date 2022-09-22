package month2.lesson8;

import java.time.LocalDate;

public class LocalDateLeap {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2017, 1, 13);
        System.out.println(date.isLeapYear());

        LocalDate date1 = LocalDate.of(2016, 1, 13);
        System.out.println(date1.isLeapYear());
    }
}
