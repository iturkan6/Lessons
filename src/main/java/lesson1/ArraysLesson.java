package lesson1;

public class ArraysLesson {
    public static void main(String[] args) {
//        String[] names = new String[3];
        String[] names1 = {"Tom", "Anna"};
        System.out.println(names1[0]);
        System.out.println(names1.length);

        for (int i = 0; i < names1.length; i++) {
            System.out.println(names1[i]);
        }

        for (String name : names1) {
            System.out.println(name);
        }
    }


}
