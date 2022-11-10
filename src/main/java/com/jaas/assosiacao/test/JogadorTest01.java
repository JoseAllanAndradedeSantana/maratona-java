package com.jaas.assosiacao.test;

import com.jaas.assosiacao.domain.Jogador;

public class JogadorTest01 {
    public static void main(String[] args){
        Jogador j1 = new Jogador("Allan");
        Jogador j2 = new Jogador("Isaac");
        Jogador j3 = new Jogador("Mariane");
        Jogador[] jogadores = new Jogador[]{j1,j2,j3};

        for(Jogador jogador : jogadores){
            jogador.imprime();
        }
    }
}
