package dates;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {


        Locale localeItaly = new Locale("it", "IT");
        Locale localeCH = new Locale("it", "CH");
        Locale localeJP = new Locale("ja","JP");
        Locale localeIN = new Locale("hi","IN");

        Calendar calendar = Calendar.getInstance();

        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.FULL,localeCH);
        DateFormat dateFormat2 = DateFormat.getDateInstance(DateFormat.FULL,localeItaly);
        DateFormat dateFormat3 = DateFormat.getDateInstance(DateFormat.FULL,localeIN);
        DateFormat dateFormat4 = DateFormat.getDateInstance(DateFormat.FULL,localeJP);

        System.out.println(dateFormat.format(calendar.getTime()));
        System.out.println(dateFormat2.format(calendar.getTime()));
        System.out.println(dateFormat3.format(calendar.getTime()));
        System.out.println(dateFormat4.format(calendar.getTime()));
        System.out.println(localeCH.getDisplayCountry());
        System.out.println(localeItaly.getDisplayCountry());
        System.out.println(localeJP.getDisplayCountry());
        System.out.println(localeCH.getDisplayCountry());
    }

}
