package estudos.associacao.seminario.test;

import estudos.associacao.seminario.domain.Aluno;
import estudos.associacao.seminario.domain.Local;
import estudos.associacao.seminario.domain.Professor;
import estudos.associacao.seminario.domain.Seminario;

public class SeminarioTest {
    public static void main(String[] args) {
        Local local = new Local("Rua Americo Vespucio");
        Aluno aluno1 = new Aluno("Jose",32);
        Professor professor = new Professor("Allan","T.I");
        Aluno[] alunos = {aluno1};
        Seminario seminario = new Seminario("Titulo",alunos,local);
        Seminario[] seminarios = {seminario};
        professor.setSeminarios(seminarios);
        professor.imprime();

    }
}
