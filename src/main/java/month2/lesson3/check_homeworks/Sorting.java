package month2.lesson3.check_homeworks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Sorting {
    public static ArrayList<String> sortNames(ArrayList<String> names) {
        Collections.sort(names);
        return names;
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Mike", "Tom", "Andrew", "John", "David", "Oliver"));
        System.out.println(sortNames(names));
    }
}
