package estudos.metodos.test;

import estudos.metodos.domain.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Jose Allan";
        estudante.idade = 32;
        estudante.sexo = 'M';
        estudante.imprimeDados();
    }
}
