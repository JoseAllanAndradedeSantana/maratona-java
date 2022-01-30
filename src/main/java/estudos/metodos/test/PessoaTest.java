package estudos.metodos.test;

import estudos.metodos.domain.Pessoa;

public class PessoaTest {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();
        pessoa.setNome("Allan");
        pessoa.setIdade(-1);
        pessoa.imprimeDados();
        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
