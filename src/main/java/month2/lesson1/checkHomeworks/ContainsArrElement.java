package month2.lesson1.checkHomeworks;

public class ContainsArrElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        System.out.println(containsElement(arr, 4));
        System.out.println(containsElement(arr, 10));
    }

//    public static boolean containsElement(int[] arr, int target) {
//        boolean contains = true;
//        for (int i = 0; i < arr.length; i++) {
//            if (target == arr[i]) {
//                return contains;
//            }
//        }
//        return false;
//    }

    public static boolean containsElement(int[] arr, int target) {
        for (int j : arr) {
            if (target == j) {
                return true;
            }
        }
        return false;
    }
}

