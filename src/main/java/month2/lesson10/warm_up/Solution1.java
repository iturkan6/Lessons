package month2.lesson10.warm_up;

public class Solution1 {
    //1012
    public static int findDigits(int n) {
        int count = 0;
        String number = String.valueOf(n); // "1012"
        for (int i = 0; i < number.length(); i++) {
            int element = Character.getNumericValue(number.charAt(i));
//            int value = Integer.parseInt(String.valueOf(number.charAt(i))); // "1"
            if (element != 0 && n % element == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(findDigits(1012));
    }

}
