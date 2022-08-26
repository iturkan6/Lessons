package month2.lesson6;

public class TryCatch {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Something went wrong");
        }
    }
}
