package estudos.heranca.test;

import estudos.heranca.domain.Endereco;
import estudos.heranca.domain.Funcionario;

import java.math.BigDecimal;

public class FuncionarioTest {
    public static void main(String[] args) {
        Endereco end =  new Endereco();
        Funcionario func = new Funcionario();
        end.setRua("Americo Vespucio");
        end.setCep("11702800");
        func.setNome("Jose Allan");
        func.setCpf("39029979828");
        func.setEndereco(end);
        func.setSalario(new BigDecimal(4000));
        func.imprime();

    }

}
