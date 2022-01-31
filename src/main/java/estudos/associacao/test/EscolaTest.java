package estudos.associacao.test;

import estudos.associacao.domain.Escola;
import estudos.associacao.domain.Professor;

public class EscolaTest {
    public static void main(String[] args) {
        Professor professor = new Professor("Allan");
        Professor professor1 = new Professor("Jose");
        Professor[] professores = {professor,professor1};
        Escola escola = new Escola("Santa Cecilia");
        escola.setProfessores(professores);
        escola.imprime();

    }
}
