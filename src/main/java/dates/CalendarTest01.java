package dates;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat format = new SimpleDateFormat("yy");
        if(calendar.getFirstDayOfWeek() == Calendar.SUNDAY){
            System.out.println("DOMINGO");
        }else{
            System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        }

        //calendar.add(Calendar.DAY_OF_MONTH,2);
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println(calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println(calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println(calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));
        System.out.println(calendar.get(Calendar.YEAR));
        int date2 =  calendar.get(Calendar.YEAR);

        System.out.println(date2);
        System.out.println();
        Date date = calendar.getTime();
        System.out.println(calendar);
        System.out.println(date);
    }
}
