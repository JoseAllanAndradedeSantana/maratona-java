package dates;

import estudos.associacao.seminario.domain.Local;

import java.time.LocalDateTime;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        LocalDateTime dt1 = LocalDateTime.of(2016, Month.SEPTEMBER,12,5,0,0);
        LocalDateTime dt2 = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(dt1,dt2));
        System.out.println(ChronoUnit.WEEKS.between(dt1,dt2));
        System.out.println(ChronoUnit.MONTHS.between(dt1,dt2));
        System.out.println(ChronoUnit.YEARS.between(dt1,dt2));

    }
}
