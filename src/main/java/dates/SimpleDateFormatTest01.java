package dates;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "dd/MM/yyyy";
        SimpleDateFormat format = new SimpleDateFormat("'Brasil' dd 'de' MMMM 'de' yyyy");
        SimpleDateFormat format2 = new SimpleDateFormat(pattern);
        Date date = new Date();
        System.out.println(format2.format(date.getTime()));
        try {
            System.out.println(format2.parse("10/11/2022"));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
