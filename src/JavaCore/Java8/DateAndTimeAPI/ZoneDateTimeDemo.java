package JavaCore.Java8.DateAndTimeAPI;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Set;

public class ZoneDateTimeDemo {
    public static void main(String[] args) {

        //Current Zone and Time
        ZonedDateTime now = ZonedDateTime.now();
        System.out.println(now);
        System.out.println(ZonedDateTime.now().getZone());

        //All Zone
        Set<String> availableZoneIds = ZoneId.getAvailableZoneIds();
       // availableZoneIds.forEach(System.out::println);
        System.out.println(availableZoneIds.size());

        ZonedDateTime VaticanCity = ZonedDateTime.now(ZoneId.of("Europe/Vatican"));
        System.out.println(VaticanCity);


    }
}
