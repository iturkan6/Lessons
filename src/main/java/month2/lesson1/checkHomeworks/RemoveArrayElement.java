package month2.lesson1.checkHomeworks;

import java.util.Arrays;

public class RemoveArrayElement {
//    public static String removeElement(int[] arr, int target) {
//        int[] new_arr = new int[arr.length - 1];
//        for (int i = 0, j = 0; i < arr.length; i++) {
//            if (arr[i] != target) {
//                new_arr[j++] = arr[i];
//
//            }
//        }
//        return Arrays.toString(new_arr);
//    }

    public static String removeElement(int[] arr, int target) {
        if (!checkContains(arr, target)) return "No such element in array";
        int[] new_arr = new int[arr.length - 1];
        int j = 0;
        for (int k : arr)
            if (k != target)
                new_arr[j++] = k;
        return Arrays.toString(new_arr);
    }


    public static boolean checkContains(int[] arr, int number) {
        for (int el : arr) {
            if (el == number) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        int target1 = 5; // int target1 = 15; olduqda exception verir
        System.out.println(removeElement(arr, target1));

    }
}
