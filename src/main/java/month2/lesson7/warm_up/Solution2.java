package month2.lesson7.warm_up;

public class Solution2 {
    public static String dayOfProgrammer(int year) {
        int feb = 28;

        if (year == 2018) feb = 15;
        if (year > 1918) {
            if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) feb = 29;
        } else {
            if (year % 4 == 0) feb = 29;
        }

        int day = 256 - (31 + feb + 31 + 30 + 31 + 30 + 31 + 31);
        return String.format("%d.09.%d", day, year);
    }

    public static void main(String[] args) {
        System.out.println(dayOfProgrammer(2017));
    }
}

