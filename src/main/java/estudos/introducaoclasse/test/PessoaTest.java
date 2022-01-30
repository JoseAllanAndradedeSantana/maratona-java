package estudos.introducaoclasse.test;

import estudos.introducaoclasse.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa p1 = new Pessoa();
        p1.nome = "Allan";
        p1.idade = 32;
        p1.sexo = 'M';
        System.out.println(p1.nome + " " + p1.idade + " " + p1.sexo);
    }
}
