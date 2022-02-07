package dates;

import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        Period p1 = Period.ofWeeks(8);
        System.out.println(p1);
    }
}
