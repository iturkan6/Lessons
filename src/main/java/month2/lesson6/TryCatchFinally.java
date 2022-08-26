package month2.lesson6;

public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        }catch (ArrayIndexOutOfBoundsException ex) {
            System.out.println("Something went wrong");
        }finally {
            System.out.println("Try catch block is finished");
        }
    }
}
