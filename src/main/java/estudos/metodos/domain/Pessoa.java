package estudos.metodos.domain;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprimeDados(){
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        if(idade < 0) {
            System.out.println("Idade Invalida");
            return;
        }
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }
}
