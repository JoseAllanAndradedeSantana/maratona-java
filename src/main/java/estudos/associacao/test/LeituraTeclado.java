package estudos.associacao.test;

import java.util.Scanner;

public class LeituraTeclado {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("### SOFTWARE DE RESPOSTAS ###");
        System.out.println("Digite sua pergunta");
        String pergunta = input.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else {
            System.out.println("NAO");
        }
    }
}
