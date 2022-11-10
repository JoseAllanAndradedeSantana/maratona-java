package dates;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localePT = new Locale("pt","BR");
        Locale localeJP = Locale.JAPAN;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] numberFormats = new NumberFormat[4];
        numberFormats[0] = NumberFormat.getCurrencyInstance();
        numberFormats[1] = NumberFormat.getCurrencyInstance(localePT);
        numberFormats[2] = NumberFormat.getCurrencyInstance(localeIT);
        numberFormats[3] = NumberFormat.getCurrencyInstance(localeJP);

        double valor = 1000.213;

        for (NumberFormat ns : numberFormats){
            System.out.println(ns.format(valor));

        }

        String valorString = "1000.20";
        double v = Double.parseDouble(valorString);
        System.out.println(v);
    }
}
