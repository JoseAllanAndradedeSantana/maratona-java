package polimorfismo.domain;

public class Carro extends Produto{
    public static final double IMPOSTO = 0.41;
    public Carro(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double calcularImpostoProduto() {
        System.out.println("Calculando Imposto Carro");
        return this.valor * IMPOSTO;
    }


}
