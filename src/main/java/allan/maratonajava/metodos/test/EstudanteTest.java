package allan.maratonajava.metodos.test;

import allan.maratonajava.metodos.domain.Estudante;
import allan.maratonajava.metodos.domain.PrintEstudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante1 = new Estudante();
        Estudante estudante2 = new Estudante();
        PrintEstudante imprimir = new PrintEstudante();

        estudante1.nome ="Allan Jose";
        estudante1.idade = 31;
        estudante1.sexo = 'M';

        estudante2.nome ="Allan Jose";
        estudante2.idade = 32;
        estudante2.sexo = 'M';

        imprimir.imprime(estudante1);
        imprimir.imprime(estudante2);
    }
}
