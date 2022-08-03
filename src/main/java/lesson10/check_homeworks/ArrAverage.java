package lesson10.check_homeworks;

public class ArrAverage {
    public static double average(int[] arr) {
        double sum = 0;
        double avg;
//        for (int i = 0; i < arr.length; i++) {
//            sum += arr[i];
//        }
        for (int j : arr) {
            sum += j;
        }
        avg = sum / arr.length;
        return avg;
    }

    public static void main(String[] args) {
        int[] arr = {2, 4, 6, 8};
        System.out.println(average(arr));


    }
}
