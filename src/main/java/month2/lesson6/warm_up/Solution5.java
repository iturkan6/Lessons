package month2.lesson6.warm_up;

import java.util.HashSet;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Solution5 {
    public static String twoStrings(String s1, String s2) {
        HashSet<Character> set = IntStream.range(0, s1.length()).mapToObj(s1::charAt).collect(Collectors.toCollection(HashSet::new));
        for (int i = 0; i < s2.length(); i++) if (set.contains(s2.charAt(i))) return "YES";
        return "NO";
    }
}
