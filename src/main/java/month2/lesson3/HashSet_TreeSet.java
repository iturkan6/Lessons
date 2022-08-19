package month2.lesson3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class HashSet_TreeSet {
    public static void main(String[] args) {
        int[] a = {77, 23, 4, 66, 99, 112, 45, 56, 39, 89};
        Set<Integer> s = new HashSet<>();
        for (int i = 0; i < 5; i++) {
            s.add(a[i]);
        }
        System.out.println(s);
        TreeSet<Integer> sorted = new TreeSet<>();
        for (int i = 0; i < 5; i++) {
            sorted.add(a[i]);
        }
        System.out.println("Sorted list = ");
        System.out.println(sorted);
    }
}

