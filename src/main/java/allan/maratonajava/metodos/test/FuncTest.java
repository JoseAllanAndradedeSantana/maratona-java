package allan.maratonajava.metodos.test;

import allan.maratonajava.metodos.domain.Funcionario;

public class FuncTest {
    public static void main(String[] args) {
        Funcionario func = new Funcionario();
        func.nome = "Allan";
        func.idade = 32;
        func.salarios = new double[]{4000.00,4000.00,4000.00};
        func.imprime();
        func.imprimeMediaSalario();
    }
}
