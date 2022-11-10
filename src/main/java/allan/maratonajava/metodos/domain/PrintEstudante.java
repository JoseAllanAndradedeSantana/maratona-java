package allan.maratonajava.metodos.domain;

public class PrintEstudante {
    public void imprime(Estudante estudante){
        System.out.println("---------------------");
        System.out.println("###RELATORIO###");
        System.out.println("Nome: "+estudante.nome);
        System.out.println("Idade: "+estudante.idade);
        System.out.println("Sexo: "+estudante.sexo);
        System.out.println("###Finalizando Dados###");
    }
}
