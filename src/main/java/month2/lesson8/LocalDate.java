package month2.lesson8;

public class LocalDate {
    public static void main(String[] args) {
        java.time.LocalDate date = java.time.LocalDate.now();
        System.out.println(date);
//        System.out.println(date.minusDays(1));
        java.time.LocalDate yesterday = date.minusDays(1);
        System.out.println(yesterday);
        java.time.LocalDate tomorrow = yesterday.plusDays(2);
        System.out.println(tomorrow);
    }
}
