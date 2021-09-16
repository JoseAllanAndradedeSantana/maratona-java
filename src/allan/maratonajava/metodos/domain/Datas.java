package allan.maratonajava.metodos.domain;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Date;

public class Datas {

    public static void main(String[] args) {
        Date data = new Date(1000000000);
        System.out.println(data);

        Calendar c = Calendar.getInstance();
        DateFormat[] df = new DateFormat[4];
        df[0] = DateFormat.getInstance();
        df[1] = DateFormat.getDateInstance();
        df[2] = DateFormat.getDateTimeInstance();
        df[3] = DateFormat.getDateInstance(DateFormat.FULL);

        for (DateFormat dateformat:df) {
            System.out.println(dateformat.format(c.getTime()));

        }

    }
}
