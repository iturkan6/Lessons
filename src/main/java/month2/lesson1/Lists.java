package month2.lesson1;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.stream.IntStream;

public class Lists {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>();
        Iterator<Integer> iterator = integers.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        HashMap<String, Integer> map = new HashMap<>();
        map.put("name", 5);
        map.put("surname", 7);
        IntStream.range(0, map.size()).forEach(map::get);
        map.keySet().stream().map(el -> el + " " + map.get(el)).forEach(System.out::println);
    }
}
