package month2.lesson5.warm_up.check_homework;

import java.util.Arrays;
import java.util.HashSet;

public class Compare {
//    public static boolean compareHashSets(HashSet<String> names1, HashSet<String> names2) {
//        if (names1.equals(names2)) {
//            return true;
//        }
//        return false;
//    }

    public static boolean compareHashSets(HashSet<String> names1, HashSet<String> names2) {
        return names1.equals(names2);
    }

    public static void main(String[] args) {
        HashSet<String> names1 = new HashSet<>(Arrays.asList("Ajay", "Vijay", "Mahesh"));
        HashSet<String> names2 = new HashSet<>(Arrays.asList("Ajay", "Vijay", "Mahesh"));
        HashSet<String> names3 = new HashSet<>(Arrays.asList("Ajay", "Vijay", "Dinesh"));

        System.out.println(compareHashSets(names1, names2));
        System.out.println(compareHashSets(names1, names3));

    }
}
