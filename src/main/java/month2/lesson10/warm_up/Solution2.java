package month2.lesson10.warm_up;

import java.util.stream.IntStream;

public class Solution2 {
    //1012
    public static int findDigits(int n) {
        String number = String.valueOf(n); // "1012"
        return (int) IntStream.range(0, number.length()).map(i -> Character.getNumericValue(number.charAt(i))).
                filter(element -> element != 0 && n % element == 0).count();
    }

    public static void main(String[] args) {
        System.out.println(findDigits(1012));
    }

}
