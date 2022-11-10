package polimorfismo.test;

import polimorfismo.domain.Combustivel;
import polimorfismo.domain.Computador;
import polimorfismo.domain.Tv;
import polimorfismo.service.CalcularImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Computador computador = new Computador("Samsung I5",3400);

        CalcularImposto.calcularImposto(computador);

        Tv tv = new Tv("Samsung s10",2000);
        CalcularImposto.calcularImposto(tv);

        Combustivel c = new Combustivel("Gasolina Comum", 8);
        CalcularImposto.calcularImposto(c);
    }
}
