package polimorfismo.service;

import polimorfismo.domain.Carro;
import polimorfismo.domain.Computador;

public class CalcularImposto {
    public static void calcularImpostoComputador(Computador computador){
        System.out.println("----RELATÓRIO DE IMPOSTO-----");
        double imposto = computador.calcularImpostoProduto();
        System.out.println(computador.getName());
        System.out.println(computador.getValor());
        System.out.println(imposto);
    }

    public static void calcularImpostoCarro(Carro carro){
        System.out.println("-------RELATÓRIO DE IMPOSTO--------");
        double imposto = carro.calcularImpostoProduto();
        System.out.println(carro.getName());
        System.out.println(carro.getValor());
        System.out.println(imposto);
    }
}
