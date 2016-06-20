package dataAndTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

/**
 * Created by Jeka on 20/06/2016.
 */
public class Main {
    public static void main(String[] args) {
//        LocalDate
//        LocalTime
        LocalDateTime now = LocalDateTime.now();
        ZoneId losAngeles = ZoneId.of("America/Los_Angeles");
        ZonedDateTime losAnfelesDateTime = ZonedDateTime.of(now, losAngeles);

        LocalDateTime afterTommorow = now.plusDays(2);
        String format = afterTommorow.format(DateTimeFormatter.ofPattern("dd--MM--yyyy"));
        System.out.println(format);
        long between = ChronoUnit.HOURS.between(now, afterTommorow);
        System.out.println("between = " + between);
    }
}
