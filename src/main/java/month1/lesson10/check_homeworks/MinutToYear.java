package month1.lesson10.check_homeworks;

import java.util.Scanner;

public class MinutToYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of minutes");
        double minut = scanner.nextDouble();
        double minutesInYear = 60 * 24 * 365;
        int year = (int) (minut / minutesInYear);
        int days = (int) (minut / 60 / 24) % 365;
        System.out.println((int) minut + " minutes is approximately " + year + " years and " + days + " days");

    }
}
