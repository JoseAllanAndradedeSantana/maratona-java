package allan.maratonajava.metodos.test;

import allan.maratonajava.metodos.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora somar = new Calculadora();
        somar.somarDoisNumeros();
        double result = somar.somaDoisNumeros(20.0, 40.0);
        int[] numeros = {1,2,3,4,5};
        somar.somaArray(numeros);
        System.out.println(result);
    }
}
