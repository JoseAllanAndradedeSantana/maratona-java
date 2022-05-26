package com.jaas.estruturadedados.atribuicaoreferencia;

public class Atribuicao {
    public static void main(String[] args) {
        int intA = 1;
        int intB = intA;
        System.out.println("IntA:"+intA+" "+ "IntB:"+intB);
        intA = 2;
        System.out.println("IntA:"+intA+" "+ "IntB:"+intB);
    }
}
