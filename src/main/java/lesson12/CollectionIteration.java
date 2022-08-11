package lesson12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.ListIterator;

public class CollectionIteration {
    public static void main(String[] args) {
        ArrayList<Integer> integers = new ArrayList<>(Arrays.asList(1, 2, 7, 9, 15));

        //Ways to iterate in Collection framework
        //1. Classic for loop

        for (int i = 0; i < integers.size(); i++) {
            System.out.println(integers.get(i));
        }


        //2. Iterator method

        ListIterator<Integer> iterator = integers.listIterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }


        //3. The Enhanced For Loop

        for (Integer integer : integers) {
            System.out.println(integer);
        }

        //4. The forEach Method with Lambda Expressions

        integers.forEach(integer -> System.out.println(integer));
        integers.forEach(System.out::println);

    }
}
