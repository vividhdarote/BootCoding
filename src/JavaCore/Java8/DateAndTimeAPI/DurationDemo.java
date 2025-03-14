package JavaCore.Java8.DateAndTimeAPI;

import java.time.Duration;
import java.time.Instant;
import java.time.temporal.ChronoUnit;

public class DurationDemo {
    public static void main(String[] args) throws InterruptedException {

        Instant start = Instant.now();
        Thread.sleep(1000);
        Instant end = Instant.now();

        Duration duration = Duration.between(start, end);
        System.out.println(duration);

        Duration duration1 = Duration.of(1, ChronoUnit.MILLIS);
        System.out.println(duration1);

        int i = duration.compareTo(duration1);
        System.out.println(i);
    }
}
