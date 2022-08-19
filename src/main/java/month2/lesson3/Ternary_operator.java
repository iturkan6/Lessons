package month2.lesson3;

public class Ternary_operator {
    public static void main(String[] args) {
        int[] arr = {1, 7, 3, 8};
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }else {
                max = max;
            }
            max = max < arr[i] ? arr[i] : max; //ternary operator
        }
        int a = 3;
        System.out.println(a == 5 ? "Good job" : "You are failed");
    }
}
