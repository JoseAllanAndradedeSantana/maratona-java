package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PatternMatcherTest03 {
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
        //()
        //|
        //{nm} n p m
        //$ fim da linha
        //() agrupamento
        // | ou Or
        //. 1.3
        // ^
        String regex = "([a-zA-Z0-9\\._-])+@([a-z])+(\\.([a-z])+)+";
        String texto = "allan_santana2810@hotmail.com, allan_santana2810@icloud.com.br, teste";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);

        while(matcher.find()){
            System.out.print(matcher.start()+" "+  matcher.group()+ "\n");
        }
    }
}
