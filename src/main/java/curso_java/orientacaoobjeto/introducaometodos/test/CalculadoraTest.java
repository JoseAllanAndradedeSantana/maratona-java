package curso_java.orientacaoobjeto.introducaometodos.test;

import curso_java.orientacaoobjeto.introducaometodos.domain.Calculadora;

public class CalculadoraTest {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();
        calculadora.soma();
        calculadora.multiplica(2,2);
    }
}
