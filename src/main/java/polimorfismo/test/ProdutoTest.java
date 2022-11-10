package polimorfismo.test;

import polimorfismo.domain.Carro;
import polimorfismo.domain.Computador;
import polimorfismo.service.CalcularImposto;

public class ProdutoTest {
    public static void main(String[] args) {

        Computador computador = new Computador("i7-Linux",5000);
        Carro carro = new Carro("Fox-2015",38000);
        CalcularImposto.calcularImpostoComputador(computador);
        CalcularImposto.calcularImpostoCarro(carro);

    }
}
