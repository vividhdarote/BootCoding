package JavaCore.Java8.DateAndTimeAPI;

import java.time.LocalDate;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormatterDemo {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        System.out.println(now);

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println(now.format(dateTimeFormatter));

        //Custom Date Parse
        String date ="13/07/2003";
        LocalDate customParse = LocalDate.parse(date, dateTimeFormatter);
        System.out.println(customParse);


        String date2 = "13/07/2003 10:01:20+05:20";
        DateTimeFormatter dateTimeFormatter1 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ssXXX");
        ZonedDateTime parse = ZonedDateTime.parse(date2, dateTimeFormatter1);
        System.out.println(parse);

    }
}
