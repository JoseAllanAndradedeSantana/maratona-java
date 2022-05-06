package com.jaas.metodos.test;

import com.jaas.metodos.domain.Emprestimo;

public class EmprestimoTest {
    public static void main(String[] args){
        Emprestimo.calcular(1000,Emprestimo.getDuasParcelas());
        Emprestimo.calcular(1000, Emprestimo.getTresParcelas());
        Emprestimo.calcular(1000,5);
    }
}
