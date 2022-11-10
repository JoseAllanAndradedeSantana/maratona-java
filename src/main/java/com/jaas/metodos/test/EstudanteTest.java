package com.jaas.metodos.test;

import com.jaas.metodos.domain.Estudante;

public class EstudanteTest {
    public static void main(String[] args){
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Allan";
        estudante01.idade = 32;
        estudante01.sexo = 'M';

        estudante02.nome = "Isaac";
        estudante02.idade = 1;
        estudante02.sexo = 'M';

        estudante01.imprime();
    }
}
