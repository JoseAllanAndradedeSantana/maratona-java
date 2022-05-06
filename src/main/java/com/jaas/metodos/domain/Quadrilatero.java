package com.jaas.metodos.domain;

public class Quadrilatero {
    public static void area(double lado){
        double quadrado = lado * lado;
        System.out.println("Area do quadrado " + quadrado);
    }

    public static void area(double lado1, double lado2){
        double retangulo = lado1 * lado2;
        System.out.println("Area do retangulo " + retangulo);
    }

    public static void area(double baseMaior, double baseMenor, double altura){
        double trapezio = (((baseMaior+baseMenor) * altura) / 2);
        System.out.println("Area do trapezio " + trapezio);
    }
}
