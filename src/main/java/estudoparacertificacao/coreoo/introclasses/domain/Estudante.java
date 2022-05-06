package estudoparacertificacao.coreoo.introclasses.domain;

import java.time.OffsetDateTime;

public class Estudante {
    private String nome;
    private String curso;
    private String ra;
    private int idade;
    private OffsetDateTime datacadastro;

    public Estudante(){

    }

    public Estudante(String nome, String curso, String ra, int idade, OffsetDateTime datacadastro) {
        this.nome = nome;
        this.curso = curso;
        this.ra = ra;
        this.idade = idade;
        this.datacadastro = datacadastro;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCurso() {
        return curso;
    }

    public void setCurso(String curso) {
        this.curso = curso;
    }

    public String getRa() {
        return ra;
    }

    public void setRa(String ra) {
        this.ra = ra;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public OffsetDateTime getDatacadastro() {
        return datacadastro;
    }

    public void setDatacadastro(OffsetDateTime datacadastro) {
        this.datacadastro = datacadastro;
    }

    @Override
    public String toString() {
        return "Estudante{" +
                "nome='" + nome + '\'' +
                ", curso='" + curso + '\'' +
                ", ra='" + ra + '\'' +
                ", idade=" + idade +
                ", datacadastro=" + datacadastro +
                '}';
    }
}
