package month2.lesson4;

import java.util.HashMap;

public class HashMap_updating {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(34, "Tom");
        students.put(56, "Ajay");
        students.put(70, "Vijay");
        System.out.println("Initial map" + students);

        students.put(70, "Prakash");


        System.out.println(students);
    }
}
