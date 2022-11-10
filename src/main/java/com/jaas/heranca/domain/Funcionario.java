package com.jaas.heranca.domain;

public class Funcionario extends Pessoa{
    private Double salario;

    public void imprimir(){
        super.imprimir();
        System.out.println(this.salario);

    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }
}
