package month2.lesson3.check_homeworks;

import java.util.ArrayList;
import java.util.Arrays;

public class SearchElement {
    public static String word(ArrayList<String> names, int index) {
        return names.get(index);
    }

    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Tony", "Mike", "Miguel", "Leo"));
        System.out.println(word(names, 3));
        System.out.println(word(names, 0));
    }
}
