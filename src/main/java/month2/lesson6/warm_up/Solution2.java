package month2.lesson6.warm_up;

public class Solution2 {
    public static String twoStrings(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            if (s2.indexOf(s1.charAt(i)) >= 0) {
                return "YES";
            }
        }
        return "NO";
    }
}
