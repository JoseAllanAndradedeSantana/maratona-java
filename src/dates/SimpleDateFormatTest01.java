package dates;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        SimpleDateFormat format = new SimpleDateFormat("'Brasil' dd 'de' MMMM 'de' yyyy");
        Date date = new Date();
        System.out.println(format.format(date.getTime()));
    }
}
