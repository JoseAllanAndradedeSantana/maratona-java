package dates;

import java.util.Calendar;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("DOMINGO");
        }
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        System.out.println(calendar);
    }
}
