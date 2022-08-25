package month2.lesson5.warm_up;

import java.util.stream.IntStream;

public class Solution3 {
    public static int camelcase(String s) {
        return (int) IntStream.range(0, s.length()).filter(x -> Character.isUpperCase(s.charAt(x))).count() + 1;
    }

    public static void main(String[] args) {
        System.out.println(camelcase("saveChangesInTheEditor"));
    }
}
