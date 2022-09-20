package month2.lesson8.check_homework;


public class Palindrome {
//    public static boolean checkIfPalindrome(String s1) {
//        String s2 = new StringBuffer(s1).reverse().toString();
//        if (s1.equals(s2)) {
//            return true;
//        }
//        return false;
//    }

    public static boolean checkIfPalindrome(String s1) {
        String s2 = new StringBuffer(s1).reverse().toString();
        return s1.equals(s2);
    }

    public static void main(String[] args) {
        System.out.println(checkIfPalindrome("kayak"));
    }
}

