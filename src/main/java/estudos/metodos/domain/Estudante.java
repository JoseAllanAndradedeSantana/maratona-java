package estudos.metodos.domain;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo = 'M';

    public void imprimeDados(){
        System.out.println("#### Impressao de dados cadastrais ####");
        System.out.println(this.nome);
        System.out.println(this.idade);
        System.out.println(this.sexo);
    }
}
