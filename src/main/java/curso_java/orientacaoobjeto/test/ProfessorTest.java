package curso_java.orientacaoobjeto.test;

import curso_java.orientacaoobjeto.domain.Professor;

public class ProfessorTest {
    public static void main(String[] args) {
        Professor professor = new Professor();
        professor.nome = "Allan";
        professor.idade = 32;
        professor.sexo = 'M';

        String msg = String.format("Professor:%s, idade:%s, sexo:%s",professor.nome,professor.idade,professor.sexo);

        System.out.println(msg);
    }
}
