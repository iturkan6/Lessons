package month2.lesson8.check_homework;

public class IntegerSolution {
    // Integer solution

    public static boolean checkIfPalindrome(String s1) {
        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s1.charAt(s1.length() - 1 - i)) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        System.out.println(checkIfPalindrome("kayak"));
    }
}
