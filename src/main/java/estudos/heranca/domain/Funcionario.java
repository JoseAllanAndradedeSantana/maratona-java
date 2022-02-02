package estudos.heranca.domain;

import java.math.BigDecimal;

public class Funcionario extends Pessoa{
    private BigDecimal salario;

    public void imprime(){
        super.imprime();
        System.out.println(this.salario);
    }

    public BigDecimal getSalario() {
        return salario;
    }

    public void setSalario(BigDecimal salario) {
        this.salario = salario;
    }
}
