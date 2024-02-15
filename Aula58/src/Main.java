import java.sql.SQLOutput;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        LocalDate d1 = LocalDate.parse("2022-07-20");
        LocalDateTime d2 = LocalDateTime.parse("2022-07-20T01:30:26");
        Instant d3 = Instant.parse("2022-07-20T01:30:26Z");

        DateTimeFormatter fmt1 = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        System.out.println("d1 = " + d1);
        System.out.println("d1 = " + d1.format(fmt1));
        System.out.println("d1 = " + fmt1.format(d1));

        DateTimeFormatter fmt2 = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm").withZone(ZoneId.systemDefault());
        System.out.println("d3 = " + fmt2.format(d3));

        DateTimeFormatter fmt3 = DateTimeFormatter.ISO_DATE_TIME;
        DateTimeFormatter fmt4 = DateTimeFormatter.ISO_INSTANT;
        System.out.println("d2 = " + fmt3.format(d2));
    }
}