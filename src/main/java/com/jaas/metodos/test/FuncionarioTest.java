package com.jaas.metodos.test;

import com.jaas.metodos.domain.Funcionario;

public class FuncionarioTest {
    public static void main(String[] args){
        Funcionario func = new Funcionario();
        func.nome = "Allan";
        func.idade = 32;
        func.salarios = new double[]{4000,4000,4000};
        func.imprime();
        func.mediaSalario();
    }
}
