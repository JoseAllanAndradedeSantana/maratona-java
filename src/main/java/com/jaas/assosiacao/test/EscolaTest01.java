package com.jaas.assosiacao.test;

import com.jaas.assosiacao.domain.Escola;
import com.jaas.assosiacao.domain.Professor;

public class EscolaTest01 {
    public static void main(String[] args){
        Professor professor1 = new Professor("Allan Santana");
        Professor professor2 = new Professor("Jose Allan");
        Escola escola = new Escola("Santa Cecilia");

        Professor[] professores = new Professor[]{professor1,professor2};

        escola.setProfessores(professores);
        escola.imprime();

    }
}
