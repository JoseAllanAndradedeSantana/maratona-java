package dates;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1_000_000_000); // long 10000 1970
        System.out.println(date);

        Date date2 = new Date();
        System.out.println(date2.getTime());// long 1632085085154 19/09/2021
        date2.setTime(date2.getTime() - 3_600_000);
        System.out.println(date2);

    }



}
