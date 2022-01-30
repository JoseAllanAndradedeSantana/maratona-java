package estudos.introducaoclasse.test;

import estudos.introducaoclasse.domain.Estudante;

public class EstudanteTest {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        estudante.nome = "Jose Allan";
        estudante.idade = 32;
        estudante.sexo = 'M';

        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);
    }
}
