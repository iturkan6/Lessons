package month2.lesson5.warm_up.check_homework;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class HashSetToArrayList {
    //    public static ArrayList convert(HashSet<String> cities, ArrayList<String> city_names) {
    //        return city_names = new ArrayList<>(cities);
    //    }
//    public static ArrayList<String> convert(HashSet<String> cities) {
//        ArrayList<String> result = new ArrayList<>(cities);
//        return result;
//    }

    public static ArrayList<String> convert(HashSet<String> cities) {
        return new ArrayList<>(cities);
    }

    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>(Arrays.asList("London", "Prague", "Washington", "Tashkent"));
        System.out.println(convert(cities));
    }
}
