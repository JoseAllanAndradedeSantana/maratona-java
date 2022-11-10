package jdbc.model;

public class FuncionarioSoc {
    private Long id;
    private String nome;

    public FuncionarioSoc() {
    }

    public FuncionarioSoc(Long id, String nome) {
        this.id = id;
        this.nome = nome;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "FuncionarioSoc{" +
                "id=" + id +
                ", nome='" + nome + '\'' +
                '}';
    }
}
