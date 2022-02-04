package estudos.polimorfismo.service;

import estudos.polimorfismo.domain.Produto;

public class CalculaImposto {
    public static void calculaImposto(Produto produto){
        System.out.println("### Relatorio de Imposto a pagar ###");
        double imposto = produto.calcularImpostoProduto();
        if(imposto > 0){
        System.out.println("Nome: "+produto.getNome());
        System.out.println("R$:"+produto.getValor());
        System.out.println("Imposto a pagar : R$:"+imposto);

        }
    }
}
