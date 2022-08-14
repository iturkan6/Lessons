package month1.lesson8.task1;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] schedule = createData();
        while (true) {
            System.out.println("Please, input the day of the week:");
            String day = scanner.next();
            if (day.equals("exit")) break;
            System.out.println(checkResult(day, schedule));
        }
    }

    public static String[][] createData() {
        String[][] schedule = new String[7][2];
        schedule[0][0] = WeekDays.SUNDAY.name();
        schedule[0][1] = "do home work";
        schedule[1][0] = String.valueOf(WeekDays.MONDAY);
        schedule[1][1] = "go to courses";
        schedule[2][0] = WeekDays.TUESDAY.name();
        schedule[2][1] = "go to academy";
        schedule[3][0] = WeekDays.WEDNESDAY.name();
        schedule[3][1] = "watch a film";
        schedule[4][0] = WeekDays.THURSDAY.name();
        schedule[4][1] = "read a book";
        schedule[5][0] = WeekDays.FRIDAY.name();
        schedule[5][1] = "go to gym";
        schedule[6][0] = WeekDays.SATURDAY.name();
        schedule[6][1] = "rest";
        return schedule;
    }

    public static String checkResult(String dayOfWeek, String[][] schedule) {

        return switch (dayOfWeek.toLowerCase()) {
            case "sunday" -> printing(schedule[0][0], schedule[0][1]);
            case "monday" -> printing(schedule[1][0], schedule[1][1]);
            case "tuesday" -> printing(schedule[2][0], schedule[2][1]);
            case "wednesday" -> printing(schedule[3][0], schedule[3][1]);
            case "thursday" -> printing(schedule[4][0], schedule[4][1]);
            case "friday" -> printing(schedule[5][0], schedule[5][1]);
            case "saturday" -> printing(schedule[6][0], schedule[6][1]);
            default -> "Sorry, I don't understand you, please try again.";
        };
    }

    public static String printing(String dayOfWeek, String task) {
        return String.format("Your task for %s: %s\n", dayOfWeek, task);
    }
}
