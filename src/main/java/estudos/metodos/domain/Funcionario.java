package estudos.metodos.domain;

public class Funcionario {
    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime(){
        System.out.println(this.nome);
        System.out.println(this.idade);
        for (double salario: this.salarios){
            System.out.println(salario + " ");
        }
    }

    public void imprimeMedia(){
        double media = 0;
        for (double salario:salarios) {
            media += salario;
        }
        media /= salarios.length;
        System.out.println(media);
    }
}
