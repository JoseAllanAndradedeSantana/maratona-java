package dates;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getInstance();
        numberFormats[1] = NumberFormat.getInstance(localePT);
        numberFormats[2] = NumberFormat.getInstance(localeIT);
        numberFormats[3] = NumberFormat.getInstance(localeJP);
        
        double valor = 1000.213;

        for (NumberFormat ns : numberFormats){
            System.out.println(ns.format(valor));

        }
    }
}
