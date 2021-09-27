package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest04 {
    public static void main(String[] args) {
        String regex = "^([0-9]{3}\\.?){3}-?[0-9]{2}$";
        String regex2 = "^[0-9]{2}\\.?[0-9]{3}\\.?[0-9]{3}/[0-9]{4}?-[0-9]{2}$";
        String texto = "390.299.798-28";
        String cnpj = "00.000.000/0000-00";

        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(cnpj);

        while(matcher.find()){
            System.out.print(matcher.start()+" "+  matcher.group()+ "\n");

        }
    }

}

