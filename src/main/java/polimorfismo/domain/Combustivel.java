package polimorfismo.domain;

public class Combustivel extends Produto{

    public  static final double IMPOSTO = 0.40;
    public Combustivel(String name, double valor) {
        super(name, valor);
    }

    @Override
    public double calcularImpostoProduto() {
        System.out.println("######### Calculando Imposto " + Combustivel.class);
        return this.valor * IMPOSTO;
    }
}
