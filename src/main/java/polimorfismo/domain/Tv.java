package polimorfismo.domain;

public class Tv extends Produto{
    public static final double IMPOSTO = 0.10;


    public Tv(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double calcularImpostoProduto() {
        System.out.println("##### Calculando Imposto Eletro #####");
        return this.valor * IMPOSTO;
    }
}
