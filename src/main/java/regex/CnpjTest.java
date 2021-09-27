package regex;

import java.util.Scanner;

public class CnpjTest {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.println("Digite o CNPJ:");
        String c = en.nextLine();
        Cnpj cnpj = new Cnpj(c);
        cnpj.validarCnpj();
    }
}
