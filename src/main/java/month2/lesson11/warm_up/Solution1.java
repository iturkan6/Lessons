package month2.lesson11.warm_up;

public class Solution1 {
    public static int marsExploration(String s) {
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (i % 3 == 0 || i % 3 == 2) {
                if (s.charAt(i) != 'S') {
                    count++;
                }
            }
            if (i % 3 == 1) {
                if (s.charAt(i) != 'O') {
                    count++;
                }
            }
        }
        return count;
    }


    public static void main(String[] args) {
//        SOSSOT 1
        System.out.println(marsExploration("SOSSOT"));
    }
}
