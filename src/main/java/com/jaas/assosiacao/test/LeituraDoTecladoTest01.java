package com.jaas.assosiacao.test;

import java.util.Scanner;

public class LeituraDoTecladoTest01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu Nome completo: ");
        String nome = input.nextLine();

        System.out.print("Digite sua idade:");
        int idade = input.nextInt();

        System.out.print("Digite seu sexo F ou M: ");
        char sexo = input.next().charAt(0);

        if(nome == null || nome.equals("")){
            System.out.println("Nome nao Cadastrado");
        }else {
            System.out.println(nome);
            System.out.println(idade);
            System.out.println(sexo);
            System.out.println("Nome Cadastrado com sucesso");
        }
    }
}
