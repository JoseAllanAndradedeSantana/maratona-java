package com.jaas.metodos.domain;

public class CalculadoraNova {

    public static void soma(double numero1, double numero2){
        double resultado = numero1 + numero2;
        System.out.println("Soma " + numero1 + " + " + numero2 + " = " + resultado);
    }

    public static void subtrai(double numero1, double numero2){
        double resultado = numero1 - numero2;
        System.out.println("Subtracao " + numero1 + " - " + numero2 + " = " + resultado);
    }

    public static void multiplica(double numero1, double numero2){
        double resultado = numero1 * numero2;
        System.out.println("Multiplicacao " + numero1 + " x " + numero2 + " = " + resultado);
    }

    public static void divide(double numero1, double numero2){
        double resultado = numero1 / numero2;
        System.out.println("Divisao " + numero1 + " / " + numero2 + " = " + resultado);
    }
}
