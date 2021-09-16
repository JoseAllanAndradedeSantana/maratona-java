package allan.maratonajava.metodos.test;

import allan.maratonajava.metodos.domain.Estudante;
import allan.maratonajava.metodos.domain.PrintEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        PrintEstudante imprimir = new PrintEstudante();

        estudante1.nome ="Allan José";
        estudante1.idade = 31;
        estudante1.sexo = 'M';

        imprimir.imprime(estudante1);
    }
}
