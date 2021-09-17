package polimorfismo.domain;

public class Computador extends Produto{
    public static final double IMPOSTO = 0.21;
    public Computador(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double calcularImpostoProduto() {
        System.out.println("Calculando Imposto Computador");
        return this.valor * IMPOSTO;
    }
}
