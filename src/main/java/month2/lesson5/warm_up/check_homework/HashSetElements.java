package month2.lesson5.warm_up.check_homework;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetElements {
//    public static boolean emptyOrNot(HashSet<Integer> nums) {
//        if (nums.isEmpty()) {
//            return true;
//        }
//        return false;
//    }

    public static boolean emptyOrNot(HashSet<Integer> nums) {
        return nums.isEmpty();
    }

    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<>(Arrays.asList(1, 2, 3, 4, 5));
        System.out.println(emptyOrNot(nums));
    }
}
