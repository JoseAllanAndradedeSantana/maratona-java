package dates;

import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance().toString());
        LocalDate localDate = LocalDate.of(2019, Month.FEBRUARY,16);
        LocalDate localDate1 = LocalDate.of(1989,Month.OCTOBER,28);
        LocalDate localDate2 = LocalDate.of(1991,Month.OCTOBER,12);
        System.out.println(localDate.getDayOfMonth());
        System.out.println(localDate.getMonthValue());
        System.out.println(localDate.getMonth());
        System.out.println(localDate.getDayOfWeek());
        System.out.println(localDate.lengthOfMonth());
        System.out.println(localDate.lengthOfYear());
        System.out.println(localDate1.getDayOfMonth());
        System.out.println(localDate1.getMonthValue());
        System.out.println(localDate1.getMonth());
        System.out.println(localDate1.getDayOfWeek());
        System.out.println(localDate1.lengthOfMonth());
        System.out.println(localDate1.lengthOfYear());
        System.out.println(localDate2.getDayOfMonth());
        System.out.println(localDate2.getMonthValue());
        System.out.println(localDate2.getMonth());
        System.out.println(localDate2.getDayOfWeek());
        System.out.println(localDate2.lengthOfMonth());
        System.out.println(localDate2.lengthOfYear());
        System.out.println(localDate);
        System.out.println(localDate1);
        System.out.println(localDate2);
        LocalDate today = LocalDate.now();
        System.out.println(today);
        System.out.println(localDate.getMonth().minus(2L));
    }
}
