package JavaCore.Java8.DateAndTimeAPI;

import java.time.LocalTime;

public class LocalTimeDemo {
    public static void main(String[] args) {

        //Current
        LocalTime now = LocalTime.now();
        System.out.println(now);
        System.out.println(now.getHour());
        System.out.println(now.getMinute());
        System.out.println(now.getSecond());

        //Custom
        LocalTime customTime = LocalTime.of(22, 1, 30);
        System.out.println(customTime);

        //Parse
        String timeInString = "15:30:22";
        LocalTime parsed = LocalTime.parse(timeInString);
        System.out.println(parsed);

        //Past
        LocalTime OneHourBefore = now.minusHours(1);
        System.out.println("Current: "+now);
        System.out.println("OneHourBefore: "+OneHourBefore);

        if(now.isAfter(OneHourBefore)){
            System.out.println("Yes");
        }

    }
}
