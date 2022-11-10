package estudos.metodos.test;

import estudos.metodos.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        calc.somaDoisNumeros();
        System.out.println("Finalizando Calculadora Test");

        calc.multiplicaDoisNumeros(10,20);
    }
}
