package month2.lesson12;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDateTimeEx {
    public static void main(String[] args) {
        LocalDateTime nowDateTime  = LocalDateTime.now();
        System.out.println("Before Formatting " + nowDateTime);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        String formatDateTime = nowDateTime.format(formatter);
        System.out.println("After Formatting " + formatDateTime);
    }
}
