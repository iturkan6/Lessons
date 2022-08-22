package month2.lesson4;

import java.util.HashMap;
import java.util.Map;

public class HashMap_iteration {
    public static void main(String[] args) {
        HashMap<Integer, String> students = new HashMap<>();
        students.put(34, "Tom");
        students.put(56, "Ajay");
        students.put(70, "Vijay");
        students.put(75, "Prakash");


        for (Map.Entry<Integer, String> el: students.entrySet()) {
            System.out.println(el.getKey() + " : " + el.getValue());
        }

        for (int el: students.keySet()) {
            System.out.println(el + " - " + students.get(el));
        }

        for (String el: students.values()) {
            System.out.println(el);
        }
    }
}
