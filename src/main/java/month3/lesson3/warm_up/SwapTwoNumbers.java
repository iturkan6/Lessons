package month3.lesson3.warm_up;

import java.util.Scanner;

public class SwapTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt(); //5
        int b = scanner.nextInt(); //7
        System.out.println("Before swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After swapping");
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
}
