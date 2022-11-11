package dates;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);

        System.out.println(s1);
        System.out.println(s2);
    }
}
