package month2.lesson8.check_homework;

import java.util.stream.IntStream;

public class StreamSolution {
    public static boolean checkIfPalindrome(String s1) {
        return IntStream.range(0, s1.length()).noneMatch(i -> s1.charAt(i) != s1.charAt(s1.length() - 1 - i));
    }

    public static void main(String[] args) {
        System.out.println(checkIfPalindrome("kayak"));
    }
}
