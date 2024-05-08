package course.datetime;

import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

public class DatePattern {
    public static void main(String[] args) {

        // Local Date & Global Date - GWT | Z (zulu) | UTC
        LocalDate d1 = LocalDate.now();
        System.out.println(d1);
        LocalDateTime d2 = LocalDateTime.now();
        System.out.println(d2);
        // London Date & Time
        Instant d3 = Instant.now();
        System.out.println(d3);
        //Format - Personalized or ISO-8601 Pattern
        LocalDate d4 = LocalDate.parse("2022-08-23");
        System.out.println(d4);
    }
}
