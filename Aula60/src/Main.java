import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Main {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.parse("2022-07-20");
        LocalDateTime d2 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d3 = Instant.parse("2022-07-20T01:30:26Z");

        LocalDate pastWeekLocalDate = d1.minusDays(7);
        System.out.println(pastWeekLocalDate);

        LocalDate nextWeekLocalDate = d1.plusDays(7);
        System.out.println(nextWeekLocalDate);

        LocalDate pastMonthLocalDate = d1.minusMonths(1);
        System.out.println(pastMonthLocalDate);

        LocalDate nextMonthLocalDate = d1.plusMonths(1);
        System.out.println(nextMonthLocalDate);

        LocalDate nextYearLocalDate = d1.plusYears(3);
        System.out.println(nextYearLocalDate);

        LocalDate pastYearLocalDate = d1.minusYears(3);
        System.out.println(pastYearLocalDate);

        Instant pastWeekInstant = d3.minus(7, ChronoUnit.DAYS);
        System.out.println(pastWeekInstant);

        Instant nextWeekInstant = d3.plus(7, ChronoUnit.DAYS);
        System.out.println(nextWeekInstant);

        Duration t1 = Duration.between(d2, d2.plusDays(40));
        System.out.println(t1.toHours());

        Duration t2 = Duration.between(d2, pastWeekLocalDate.atTime(12,34));
        System.out.println(t2.toDays());

        Duration t3 = Duration.between(d2, pastWeekLocalDate.atStartOfDay()); //00:00
        System.out.println(t3.toDays());

        Duration t4 = Duration.between(pastWeekInstant, d3);
        System.out.println(t4.toHours());
    }
}