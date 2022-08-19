package month2.lesson3.warm_up;

import java.util.ArrayList;
import java.util.List;

public class SolutionV1 {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        ArrayList<Integer> result = new ArrayList<>();
        for (int el : grades) {
            if (check(el) >= 40 && check(el) - el < 3) {
                result.add(check(el));
            }else {
                result.add(el);
            }
        }
        return result;
    }

    public static int check(int num) {
        if (num % 5 == 0) return num;
        while (true) {
            if (num % 5 != 0) {
                num++;
            } else break;
        }
        return num;
    }

    public static void main(String[] args) {
        System.out.println(gradingStudents(List.of(73, 67, 38, 33)));
    }
}
