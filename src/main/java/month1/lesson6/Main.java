package month1.lesson6;

public class Main {

    enum Months{
        MARCH,
        APRIL
    }

    public static void main(String[] args) {
        System.out.println(DaysOfWeek.FRIDAY);
//        for (DaysOfWeek i : DaysOfWeek.values()){
//            System.out.println(i);
//        }
        int aa = aa(1);
        int aa1 = aa(1, 5);
        int aa2 = aa(new int[]{1, 2, 5});


        for (int i = 0; i < 1000000; i++) {
            Year year = new Year();
        }

    }

    public static int aa(int... arr){
        return arr.length;
    }



}
