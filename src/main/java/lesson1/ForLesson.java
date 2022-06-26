package lesson1;

public class ForLesson {
    public static void main(String[] args) {
        int[] arr = new int[3];
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
            System.out.println(arr[i]);
        }
        int i = 0;
        for (; i < 5; i++) {
            System.out.println(i);
        }

        int j = 0;
        while (j < 5) {
            System.out.println(j);
            j++;
        }
        for (int k = 0; i < 5;) {
            System.out.println(i);
            i++;
        }
        for (int a : arr){
            System.out.println(a);
        }

//        for (;;) {
//            System.out.println("Infinite loop");
//        }

        while (true){
            System.out.println("Infinite loop");
            break;
        }
    }
}
