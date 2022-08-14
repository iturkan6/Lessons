package month1.lesson8.task2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    Welcome to sequence application!
                        -----------------------------------------------
                        Choose action:
                        1. Enter random range
                        2. Enter array length
                        3. Create array
                        4. Print Array
                        5. Exit""");

            int range = 0;
            int length = 0;
            int[] array = new int[0];
            int choose = scanner.nextInt();
            if (choose == 5) break;
            switch (choose){
                case 1:
                    range = setupRandomRange();
                    break;
                case 2:
                    length = setupArrayLength();
                    break;
                case 3:
                    array = createArray(range, length);
                    break;
                case 4:
                    System.out.println(Arrays.toString(array));
                    break;
                default:
                    System.out.println("I can not read number");
            }
        }
    }

    public static int setupRandomRange() {
        Scanner scanner = new Scanner(System.in);
        int range;
        while (true) {
            System.out.println("Enter range for random");
            range = scanner.nextInt();
            if (range < 0) {
                System.out.println("Range can not be less that 0");
            }else {
                break;
            }
        }
        return range;
    }

    public static int setupArrayLength(){
        Scanner scanner = new Scanner(System.in);
        int length;
        while (true) {
            System.out.println("Enter length for array");
            length = scanner.nextInt();
            if (length < 0) {
                System.out.println("Length can not be less that 0");
            }else {
                break;
            }
        }
        return length;
    }

    public static int[] createArray(int range, int length){
        Random random = new Random();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(range) + 1;
        }
        return array;
    }
}
