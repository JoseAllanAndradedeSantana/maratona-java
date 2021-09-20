package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest02 {
    public static void main(String[] args) {

        // \d = return all digits
        // \D = return not all digits
        // \s = return all space in white
        // \S = not return space in white
        // \w = a-zA-Z, digitis _
        // \W = inverse \w
        //[] [a-zA-Z]
        // ? zero ou uma
        // * zero ou mais
        // + uma ou mais
        //{nm} n p m
        //$ fim da linha
        String regex = "ab";
        String texto = "abaaba";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while(matcher.find()){
            System.out.print(matcher.start()+" "+  matcher.group()+ "\n");
        }
    }
}
