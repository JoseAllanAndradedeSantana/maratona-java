package com.jaas.metodos.domain;

public class Calculadora {

    public void somar(double num1,double num2){
        double result = num1 + num2;
        System.out.println(result);
    }

    public void subtrai(double num1,double num2){
        double result = num1 - num2;
        System.out.println(result);
    }

    public void multiplica(double num1, double num2){
        double result = num1 * num2;
        System.out.println(result);
    }

    public void divide(double num1, double num2){
        if(num2 == 0) {
            System.out.println("Nao podemos dividir por 0");
            return;
        }
        double result = num1 / num2;
        System.out.println(result);
    }
}
