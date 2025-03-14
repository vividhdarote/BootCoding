package JavaCore.Java8.DateAndTimeAPI;

import java.time.Instant;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class InstantDemo {
    public static void main(String[] args) {

        long l = System.currentTimeMillis();
        System.out.println(l);

        Instant now = Instant.now();   //utc
        System.out.println(now);

        ZonedDateTime custom = now.atZone(ZoneId.of("Europe/Vatican"));
        System.out.println(custom);
    }
}
