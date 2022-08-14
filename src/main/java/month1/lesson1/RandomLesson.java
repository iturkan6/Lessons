package month1.lesson1;

import java.util.Random;

public class RandomLesson {
    public static void main(String[] args) {
        String name = "Tom";
        int num = 2;
        System.out.printf("Hello, %s, %d years old", name, num);


        Random random = new Random();
        System.out.println(random.nextInt(5));


    }
}
