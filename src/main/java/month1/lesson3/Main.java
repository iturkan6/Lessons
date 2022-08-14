package month1.lesson3;

public class Main {
    public static void main(String[] args) {
        String name = "Tom";
        String name2 = "Tom";
        int a = 1;
        int b = 1;
        boolean integers = a == b;
        boolean strings1 = name2 == name;
        boolean strings2 = name2.equals(name);
        System.out.println(integers);
        System.out.println(strings1);
        System.out.println(strings2);
        Father father1 = new Father(23, "Tom", 2.4);
        Father father2 = new Father(23, "Tom", 1.5);
        System.out.println(father2.equals(father1));
        System.out.println(father1.toString());

    }
}
