package month2.lesson6;

public class ThrowStatement {
    public static void checkAge(int age) {
        if (age < 18) {
            throw new ArithmeticException("Access denied - You must be older 18");
        }else {
            System.out.println("Access granted");
        }
    }

    public static void main(String[] args) {
        checkAge(20);
    }
}
