package lesson1.tasks.task2;

import java.util.Random;
import java.util.Scanner;

public class WriteSolution {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        int r_num;
        int c_num;
        int x = random.nextInt(4) + 1;
        int y = random.nextInt(4) + 1;
        String[][] board = {
                {"0", "1", "2", "3", "4", "5"},
                {"1", "-", "-", "-", "-", "-"},
                {"2", "-", "-", "-", "-", "-"},
                {"3", "-", "-", "-", "-", "-"},
                {"4", "-", "-", "-", "-", "-"},
                {"5", "-", "-", "-", "-", "-"},
        };
        System.out.println("All set. Get ready to rumble!");
        while (true) {
            System.out.println("Enter row number from 1 to 5");
            r_num = scanner.nextInt();
            if (r_num >= 1 && r_num <= 5) {
                break;
            }
            System.out.println("Wrong number!");
        }
        while (true) {
            System.out.println("Enter column number from 1 to 5");
            c_num = scanner.nextInt();
            if (c_num >= 1 && c_num <= 5) {
                break;
            }
            System.out.println("Wrong number!");
        }
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.println(board[i][j] + " ");
            }
            System.out.println(" ");
        }
    }
}
