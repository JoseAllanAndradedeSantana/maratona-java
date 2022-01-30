package estudos.metodos.test;

import estudos.metodos.domain.Calculadora;

public class CalculadoraTest01 {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        double result = calc.divide(20,5);
        System.out.println(result);
    }
}
