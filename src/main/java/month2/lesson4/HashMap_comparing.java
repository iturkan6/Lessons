package month2.lesson4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class HashMap_comparing {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(34, "Tom");
        students.put(56, "Ajay");
        students.put(70, "Vijay");
        students.put(75, "Prakash");


        students.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);

        students.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(x -> System.out.println(x.getKey() + " " + x.getValue()));

        List<Integer> keys1 = students.keySet().stream().collect(Collectors.toList());
        ArrayList<Integer> keys2 = new ArrayList<>(students.keySet());
    }
}
