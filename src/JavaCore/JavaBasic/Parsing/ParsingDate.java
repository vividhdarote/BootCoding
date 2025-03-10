package JavaCore.JavaBasic.Parsing;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ParsingDate {
    public static void main(String[] args) {
        // Parse date (yyyy-MM-dd)
        LocalDate date = LocalDate.parse("2025-03-11");
        System.out.println("Parsed Date: " + date);

        // Parse date and time (yyyy-MM-ddTHH:mm:ss)
        LocalDateTime dateTime = LocalDateTime.parse("2025-03-11T10:15:30");
        System.out.println("Parsed DateTime: " + dateTime);

        // Custom format
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate customDate = LocalDate.parse("11/03/2025", formatter);
        System.out.println("Custom Formatted Date: " + customDate);
    }
}
