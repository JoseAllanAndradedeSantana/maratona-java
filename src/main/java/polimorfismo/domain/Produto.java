package polimorfismo.domain;

import polimorfismo.repository.Imposto;

public abstract class Produto implements Imposto {
    protected  String name;
    protected double valor;

    public Produto(String name, double valor) {
        this.name = name;
        this.valor = valor;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
