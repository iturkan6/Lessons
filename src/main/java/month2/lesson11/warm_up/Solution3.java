package month2.lesson11.warm_up;

import java.util.stream.IntStream;

public class Solution3 {
    public static int marsExploration(String s) {
        return (int) IntStream.range(0, s.length()).
                filter(i -> ((i % 3 == 0 || i % 3 == 2) && s.charAt(i) != 'S') || ((i % 3 == 1) && s.charAt(i) != 'O'))
                .count();
    }


    public static void main(String[] args) {
//        SOSSOT 1
        System.out.println(marsExploration("SOSSOT"));
    }
}
