package month2.lesson5.warm_up.check_homework;

import java.util.Arrays;
import java.util.HashSet;

public class HashSetToArray {
    public static String[] convert1(HashSet<String> names1) {
        String[] names2 = new String[names1.size()];
        int i = 0;
        for (String s : names1) {
            names2[i++] = s;
        }
        return names2;
    }

    public static String[] convert2(HashSet<String> numbers1) {
        String[] numbers2 = new String[numbers1.size()];
        return numbers1.toArray(numbers2);
    }

    public static void main(String[] args) {
        HashSet<String> names1 = new HashSet<>(Arrays.asList("Tom", "Kate", "Toni"));
        System.out.println(Arrays.toString(convert1(names1)));
        System.out.println(Arrays.toString(convert2(names1)));
    }

}
