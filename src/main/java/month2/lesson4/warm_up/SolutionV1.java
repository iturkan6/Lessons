package month2.lesson4.warm_up;

import java.util.HashMap;
import java.util.List;

public class SolutionV1 {
    public static int equalizeArray(List<Integer> arr) {
        // [2,  2, 5, 3, 7, 3, 6, 3]
        // 2=2,
        HashMap<Integer, Integer> map = new HashMap<>();
        int max = Integer.MIN_VALUE;
        for (int el: arr) {
            if (map.containsKey(el)) {
                map.put(el, map.get(el) + 1);
            } else {
                map.put(el, 1);
            }
        }
        for (int el: map.keySet()) {
            if (map.get(el) > max) {
                max = map.get(el);
            }
        }
        return arr.size() - max;
    }
}
