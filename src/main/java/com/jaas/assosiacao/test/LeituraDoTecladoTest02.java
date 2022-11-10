package com.jaas.assosiacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest02 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Software de previsao");
        System.out.println("Digite sua pergunta que respondo sim ou nao");
        String pergunta = in.nextLine();
        if(pergunta.charAt(0) == ' '){
            System.out.println("SIM");
        }else{
            System.out.println("NAO");
        }
    }
}
