package i.ua.mail100.localdate;

import java.time.Duration;
import java.time.LocalDate;
import java.time.Period;
import java.time.temporal.ChronoUnit;

public class LocalDateApp {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.of(1900, 1, 1);
        LocalDate localDate2 = LocalDate.of(2021, 06, 15);

        Long l = ChronoUnit.DAYS.between(localDate, localDate2);
        System.out.println(l);
    }
}
