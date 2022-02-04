package estudos.polimorfismo.domain;

public class Celular extends Produto{
    public static final double IMPOSTO = 0.21;
    public Celular(String nome, double valor) {
        super(nome, valor);
    }

    @Override
    public double calcularImpostoProduto() {
        return this.valor * IMPOSTO;
    }
}
