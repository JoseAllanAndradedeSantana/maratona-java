package allan.maratonajava.metodos.domain;

public class PrintEstudante {
    public void imprime(Estudante estudante){
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
