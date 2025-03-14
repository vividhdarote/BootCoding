package JavaCore.Java8.DateAndTimeAPI;

import java.time.LocalDate;
import java.time.Period;

public class PeriodDemo {
    public static void main(String[] args) {

        LocalDate now = LocalDate.now();
        LocalDate custom = LocalDate.of(2003, 7, 13);

        Period period = Period.between(now,custom);
        System.out.println(period);
    }
}
