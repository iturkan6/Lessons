package month2.lesson2.warmup;

import java.util.List;

public class Solution {
    public static int birthdayCakeCandlesV1(List<Integer> candles) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int el : candles) {
            if (el > max) {
                max = el;
            }
        }
        for (int el: candles) {
            if (el == max) {
                count++;
            }
        }
        return count;
    }

    public static int birthdayCakeCandlesV2(List<Integer> candles) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int el : candles) if (el > max) max = el;
        for (int el: candles) if (el == max) count++;
        return count;
    }

    public static int birthdayCakeCandlesV3(List<Integer> candles) {
        int max = Integer.MIN_VALUE;
        int count = 0;
        for (int el : candles)
            if (el > max)
                max = el;

        for (int el: candles)
            if (el == max)
                count++;

        return count;
    }

    public static int birthdayCakeCandlesV4(List<Integer> candles) {
        int max = candles.stream().mapToInt(n -> n).max().orElseThrow(NoSuchFieldError::new);
        return (int) candles.stream().filter(x -> x == max).count();
    }




}
