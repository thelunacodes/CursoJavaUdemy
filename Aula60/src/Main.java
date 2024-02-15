import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;

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

        LocalDate nextYearLocalDate
    }
}