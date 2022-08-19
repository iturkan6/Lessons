package month2.lesson3.warm_up;

import java.util.ArrayList;
import java.util.List;

public class SolutionV3 {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        ArrayList<Integer> result = new ArrayList<>();
        grades.forEach(x -> result.add(check(x) >= 40 && check(x) - x < 3 ? check(x) : x));
        return result;
    }

    public static int check(int num) {
        if (num % 5 == 0) return num;
        while (num % 5 != 0) {
            num++;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(gradingStudents(List.of(73, 67, 38, 33)));
    }
}
