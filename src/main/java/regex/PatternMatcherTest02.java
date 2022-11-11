package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {

        // \d = return all digits
        // \D = return not all digits
        // \s = return all space in white \t \n \f \r
        // \S = not return space in white
        // \w = a-zA-Z, digitis _
        // \W = inverse \w
        //[] [a-zA-Z]
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        //{nm} n p m
        //$ fim da linha
        //() agrupamento
        // | ou Or
        String regex = "\\d";
        String texto = "abaaba2810";
        String regexHexaDecimal = "0[xX]([0-9a-fA-F])+(\\s|$)";
        String textoHexaDecimal = "12 0x 0x 0xFFABC 0x10G 0x1";

        Pattern pattern = Pattern.compile(regexHexaDecimal);
        Matcher matcher = pattern.matcher(textoHexaDecimal);
        System.out.println(matcher);

        while(matcher.find()){
            System.out.print(matcher.start()+" "+  matcher.group()+ " ");
        }
    }
}
