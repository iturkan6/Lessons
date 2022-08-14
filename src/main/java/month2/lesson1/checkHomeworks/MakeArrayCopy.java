package month2.lesson1.checkHomeworks;

import java.util.Arrays;

public class MakeArrayCopy {
//    public static String ArrayCopy(int[] arr) {
//        int[] new_arr = new int[arr.length];
//        for (int i = 0; i < arr.length; i++) {
//            new_arr[i] = arr[i];
//
//        }
//        return Arrays.toString(new_arr);
//    }

    public static int[] arrayCopy(int[] arr) { // name convention // return type must be array
        int[] new_arr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            new_arr[i] = arr[i];
        }
        return new_arr;
    }

    public static void main(String[] args) {
        int[] arr = {10, 4, 6, 8, 23, 5, 100};
        System.out.println(Arrays.toString(arrayCopy(arr)));


    }
}
