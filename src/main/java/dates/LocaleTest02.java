package dates;

import java.util.Locale;

public class LocaleTest02 {
    public static void main(String[] args) {
        System.out.println(Locale.getDefault());
        String[] isoLanguages2 = Locale.getISOCountries();
        String[] isoLanguages = Locale.getISOLanguages();

        for (String i1: isoLanguages) {
            System.out.print(i1+" ");

        }
        System.out.println(" ");

        for (String i2 : isoLanguages2){
            System.out.print(i2+" ");

        }




    }
}
