package allan.maratonajava.javacore.introducaoclasses.test;

import allan.maratonajava.javacore.introducaoclasses.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.nome = "Allan José";
        pessoa.idade = 31;
        pessoa.sexo = 'M';

        System.out.println(pessoa.nome);
        System.out.println(pessoa.idade);
        System.out.println(pessoa.sexo);
    }
}
