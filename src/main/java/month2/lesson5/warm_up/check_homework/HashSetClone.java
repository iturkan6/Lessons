package month2.lesson5.warm_up.check_homework;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetClone {
    public static HashSet<String> makeClone(HashSet<String> names1, HashSet<String> names2) {
        names2 = (HashSet<String>) names1.clone();
        return names2;
    }

    public static void main(String[] args) {
        HashSet<String> names2 = new HashSet<>();
        HashSet<String> names1 = new HashSet<>(Arrays.asList("Mike", "Max", "Dorothy", "Mary"));
        System.out.println(names2);
        names2 = makeClone(names1, names2);
        System.out.println(names2);
        System.out.println(names2.remove("Mike"));


    }
}
