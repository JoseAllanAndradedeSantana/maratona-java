package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Cnpj {
    String cnpj;

    public Cnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    @Override
    public String toString() {
        return "Cnpj{" +
                "cnpj='" + cnpj + '\'' +
                '}';
    }

    void validarCnpj() {
        String regex2 = "^[0-9]{2}\\.?[0-9]{3}\\.?[0-9]{3}/[0-9]{4}?-[0-9]{2}$";
        Pattern pattern = Pattern.compile(regex2);
        Matcher matcher = pattern.matcher(cnpj);


        while (matcher.find()) {
            System.out.print(matcher.start() + " " + matcher.group() + "\n");


        }

    }
}
