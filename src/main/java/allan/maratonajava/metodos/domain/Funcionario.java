package allan.maratonajava.metodos.domain;

public class Funcionario {

    public String nome;
    public int idade;
    public double[] salarios;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade + " anos");
        for (double salario : salarios) {
            System.out.println(salario);
        }
    }
    public void imprimeMediaSalario(){
            double media = 0;
            int inc = 1;
            for (double salario:salarios) {
                System.out.println(inc + "- R$" +salario);
                media += salario;
                inc++;
            }
            media /= salarios.length;
            System.out.println("Media Salarial "+media);
        }
    }

