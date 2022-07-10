package lesson5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write sequence of numbers");
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        int num3 = scanner.nextInt();
        int num4 = scanner.nextInt();
        int num5 = scanner.nextInt();
        int[] arrayMax = new int[]{num1, num2, num3, num4, num5};

        int max = findMax(arrayMax);

        System.out.printf("Max numer is %d", max);
    }
    public static int findMax(int[] arr){
        int max1 = 0;
        for (int i : arr) {
            if (max1 < i) {
                max1 = i;
            }
        }
        return max1;
    }

}
