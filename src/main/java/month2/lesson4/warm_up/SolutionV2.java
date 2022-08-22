package month2.lesson4.warm_up;

import java.util.HashMap;
import java.util.List;

public class SolutionV2 {
    public static int equalizeArray(List<Integer> arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int el: arr) {
            map.put(el, map.containsKey(el) ? map.get(el) + 1 : 1);
        }
        for (int el: map.keySet()) if (map.get(el) > max) max = map.get(el);
        return arr.size() - max;
    }
}
