package regex;

import java.util.Arrays;

public class ScannerTest01 {
    public static void main(String[] args) {
        String texto = "Jose Allan, Mariane , Isaac";
        String[] nomes = texto.split(",");
        System.out.println(texto);
        System.out.println(Arrays.toString(texto.split(",")));
        for (String nome:nomes) {
            System.out.println(nome.trim());
            System.out.println(nome.substring(2));
        }
    }
}
