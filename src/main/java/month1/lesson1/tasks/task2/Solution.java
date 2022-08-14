package month1.lesson1.tasks.task2;

import java.util.Random;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
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

        int l_num;
        int c_num;
        System.out.println("All set. Get ready to rumble!");
        boolean flag = true;
        while (flag) {
            while (true) {
                System.out.println("Enter number of row.");
                l_num = scanner.nextInt();
                if (l_num <= 5 && l_num >= 1) {
                    break;
                }
                System.out.println("Number out of range!");
            }
            while (true) {
                System.out.println("Enter number of column.");
                c_num = scanner.nextInt();
                if (c_num <= 5 && c_num >= 1) {
                    break;
                }
                System.out.println("Number out of range!");
            }

            if (l_num == x && c_num == y) {
                board[l_num][c_num] = "x";
                flag = false;
            } else board[l_num][c_num] = "*";

            for (int i = 0; i < 6; i++) {
                for (int j = 0; j < 6; j++) {
                    System.out.print(board[i][j] + " ");
                }
                System.out.println("");
            }


        }
        System.out.println("You have won!");
    }
}
