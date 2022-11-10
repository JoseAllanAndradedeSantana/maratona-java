package estudos.associacao.seminario.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor() {
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public void imprime(){
        System.out.println("=========================");
        if(this.seminarios == null) return;
        System.out.println("### Seminarios Cadastrados ###");
        for(Seminario seminario : this.seminarios){
            System.out.println("Titulo: "+seminario.getTitulo());
            System.out.println("Local: "+seminario.getLocal().getLocal());
            System.out.println("### Professor ###");
            System.out.println("Professor: "+this.nome + " " +" Especialidade: " + this.especialidade);
            System.out.println("### Alunos Cadastrados ###");
            //if(seminario.getAlunos().length >= 2) return;
            for(Aluno aluno:seminario.getAlunos()){
                System.out.println("Aluno: "+ aluno.getNome() + " idade: "+aluno.getIdade());
            }
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }
}
