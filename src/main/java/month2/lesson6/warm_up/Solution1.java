package month2.lesson6.warm_up;

public class Solution1 {
    public static String twoStrings(String s1, String s2) {
        for (int i = 0; i < s1.length(); i++) {
            for (int j = 0; j < s2.length(); j++) {
                if (s1.charAt(i) == s2.charAt(j)) {
                    return "YES";
                }
            }
        }
        return "NO";
    }
}
