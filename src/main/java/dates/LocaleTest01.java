package dates;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {


        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Calendar calendar = Calendar.getInstance();

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL,localeCH);
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL,localeItaly);

        System.out.println(dateFormat.format(calendar.getTime()));
        System.out.println(dateFormat2.format(calendar.getTime()));
        System.out.println(localeCH.getDisplayCountry());
        System.out.println(localeItaly.getDisplayCountry());
    }

}
