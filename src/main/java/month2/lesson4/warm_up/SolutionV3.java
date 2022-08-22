package month2.lesson4.warm_up;

import java.util.HashMap;
import java.util.List;
import java.util.NoSuchElementException;

public class SolutionV3 {
    public static int equalizeArray(List<Integer> arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        arr.forEach(el -> map.put(el, map.containsKey(el) ? map.get(el) + 1 : 1));
        return arr.size() - map.values().stream().mapToInt(x -> x).max().orElseThrow(NoSuchElementException::new);
    }
}
