package month2.lesson6.warm_up;

import java.util.HashSet;

public class Solution3 {
    public static String twoStrings(String s1, String s2) {
        HashSet<Character> set = new HashSet<>();
        for (int i = 0; i < s1.length(); i++) {
            set.add(s1.charAt(i));
        }
        for (int i = 0; i < s2.length(); i++) {
            if (set.contains(s2.charAt(i))) {
                return "YES";
            }
        }
        return "NO";
    }
}
