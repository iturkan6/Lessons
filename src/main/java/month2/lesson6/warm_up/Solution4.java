package month2.lesson6.warm_up;

import java.util.HashSet;

public class Solution4 {
    public static String twoStrings(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();
        s1.chars().mapToObj(x -> (char) x).forEach(x -> set.add(x));

        for (int i = 0; i < s2.length(); i++) {
            if (set.contains(s2.charAt(i))) {
                return "YES";
            }
        }
        return "NO";
    }
}
