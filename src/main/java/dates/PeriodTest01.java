package dates;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        LocalDate meet = LocalDate.of(2016, Month.SEPTEMBER,12);
        Period p1 = Period.ofWeeks(27);
        Period p2 = Period.between(meet,now);
        System.out.println(p2);
        System.out.println(p1);
    }
}
