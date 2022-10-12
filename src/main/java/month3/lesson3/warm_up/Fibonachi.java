package month3.lesson3.warm_up;

import java.util.Scanner;

//0,1,1,2,3,5,8,13,21………
public class Fibonachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int a = 0;
        int b = 0;
        int c = 1;
        for (int i = 0; i < n; i++) {
            a = b;
            b = c;
            c = a + b;
            System.out.print(a + " ");
        }
    }
}
