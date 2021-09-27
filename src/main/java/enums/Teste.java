package enums;

import java.util.Locale;
import java.util.Scanner;

public class Teste {

    public static void main(String[] args) {

        Scanner en = new Scanner(System.in);
        String te = en.nextLine();
        System.out.println("Finalizando Cadastro pelo Sistema");

        TipoCliente tc = getTipoCliente(te.toUpperCase(Locale.ROOT));
        System.out.println("Você Cadastrou o Cliente como " + tc.getTipo());

    }

    private static TipoCliente getTipoCliente(String s) {
        switch (s) {
            case "PF":
                return TipoCliente.PESSOA_FISICA;
            case "PJ":
                return TipoCliente.PESSOA_JURIDICA;
            default:
                System.out.println("Not Found");
                return null;

        }

    }
}
