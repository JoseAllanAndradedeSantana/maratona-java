package estudos.metodos.test;

import estudos.metodos.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.nome = "Jose Allan";
        func.idade = 32;
        func.salarios = new double[]{3000,3000,3000};
        func.imprime();
        func.imprimeMedia();
    }
}
