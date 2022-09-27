package month2.lesson10;

import java.time.LocalTime;

public class LocalTimeNow {
    public static void main(String[] args) {
        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalTime startTime = LocalTime.now();
        //method
        LocalTime endTime = LocalTime.now();
    }
}
