package estudos.associacao.test;

import java.util.Scanner;

public class LeituraArquivo {
    public static void main(String[] args) {
        Scanner en = new Scanner(System.in);
        System.out.println("Digite seu nome completo");
        String nome = en.nextLine();
        System.out.println(nome);
    }
}
