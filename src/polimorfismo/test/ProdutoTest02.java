package polimorfismo.test;

import polimorfismo.domain.Computador;
import polimorfismo.domain.Produto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        System.out.println("===========RELATÓRIO=========================");
        Produto produto = new Computador("INTEL CORE I5",3200);
        System.out.println("Nome: "+produto.getName());
        System.out.println("R$ "+produto.getValor());
        System.out.println("Tributação: "+produto.calcularImpostoProduto());
        System.out.println("===============================================");
    }
}
