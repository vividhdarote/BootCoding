package JavaCore.Java8.DateAndTimeAPI;

import java.time.LocalDateTime;

public class LocalDateTimeDemo {
    public static void main(String[] args) {

        //Current
        LocalDateTime now = LocalDateTime.now();
        System.out.println(now);

        //Custom Parse
        LocalDateTime myDate = LocalDateTime.parse("2003-07-13T10:01:20");
        System.out.println(myDate);
        System.out.println(myDate.getDayOfMonth());
        System.out.println(myDate.getDayOfWeek());
        System.out.println(myDate.getMonthValue());
        System.out.println(myDate.getYear());
    }
}
