package month3.lesson6;

import java.util.ArrayList;
import java.util.Arrays;

public class PrintInStream {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>(Arrays.asList("2", "4", "6", "9", "3"));
        list.stream().mapToInt(x -> Integer.parseInt(x)).filter(n -> n > 3).forEach(x -> System.out.println("My number is " + x));
    }
}
