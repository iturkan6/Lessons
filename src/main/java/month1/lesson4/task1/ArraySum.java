package month1.lesson4.task1;

public class ArraySum {
    public static void main(String[] args) {
        System.out.println(simpleArraySum(new int[]{1, 2, 3}) + " expected 6");
        System.out.println(simpleArraySum(new int[]{-4, 5, 3}) + " expected 4");
        System.out.println(simpleArraySum(new int[]{0, -5, -2}) + " expected -7");
    }

    public static int simpleArraySum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }
        return sum;
    }
    public static int simpleArraySum1(int[] arr) {
        int sum = 0;
        for (int i : arr){
            sum += i;
        }
        return sum;
    }

}
