package lambdas;

public class Produto {

    @Override
    public String toString() {
        return "Produto [nome=" + nome + ", preco=" + preco + ", desconto=" + desconto + "]";
    }

    final String nome;
    final double preco;
    final double desconto;

    public Produto(String nome, double preco, double desconto) {
        super();
        this.nome = nome;
        this.preco = preco;
        this.desconto = desconto;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }

    public double getDesconto() {
        return desconto;
    }


}
