package dates;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.*;

class ObterProximoDiaUtil implements TemporalAdjuster {

    @Override
    public Temporal adjustInto(Temporal temporal) {
        DayOfWeek dayOfWeek = DayOfWeek.of(temporal.get(ChronoField.DAY_OF_WEEK));
        int addDay;
        switch (dayOfWeek) {
            case THURSDAY:
                addDay = 1;
                break;
            case FRIDAY:
                addDay = 3;
                break;
            case SUNDAY:
                addDay = 2;
                break;
            default:
                addDay = 0;
        }
        return temporal.plus(addDay, ChronoUnit.DAYS);
    }
}

public class TemporalAdjusterTest02 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        now = LocalDate.now().with(new ObterProximoDiaUtil());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        LocalDate ld = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println(ld);
        System.out.println(ld.getDayOfWeek());
        System.out.println(TemporalAdjusters.previous(DayOfWeek.THURSDAY));

        LocalDate lastDayMonth = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(lastDayMonth);

        LocalDate lastDayYear = LocalDate.now().with(TemporalAdjusters.lastDayOfYear());
        System.out.println(lastDayYear);

    }
}
