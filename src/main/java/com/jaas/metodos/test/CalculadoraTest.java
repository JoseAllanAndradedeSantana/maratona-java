package com.jaas.metodos.test;

import com.jaas.metodos.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args){
        Calculadora calculadora = new Calculadora();
        calculadora.somar(10,10);
        calculadora.subtrai(2,1);
        calculadora.multiplica(5,5);
        calculadora.divide(0,0);
    }
}
