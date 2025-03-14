package JavaCore.Java8.DateAndTimeAPI;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;

public class LocalDateDemo {
    public static void main(String[] args) {

        //Current
        LocalDate now = LocalDate.now();
        int dayOfMonth = now.getDayOfMonth();
        DayOfWeek dayOfWeek = now.getDayOfWeek();
        Month month = now.getMonth();
        int year = now.getYear();

        System.out.println(now);
        System.out.println(dayOfMonth);
        System.out.println(dayOfWeek);
        System.out.println(month);
        System.out.println(year);

        //Custom
        LocalDate custom = LocalDate.of(2025, 7, 13);
        System.out.println(custom);


        //Past
        System.out.println("Today: " + now);
        LocalDate yesterday = now.minusDays(1);
        System.out.println("Yesterday: " + yesterday);
        LocalDate past = now.minusMonths(100);
        System.out.println("100 Month Past: " + past);


        if(now.isAfter(yesterday)){
            System.out.println("Yes");
        }

    }
}
