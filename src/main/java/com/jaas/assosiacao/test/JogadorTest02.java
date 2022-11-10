package com.jaas.assosiacao.test;

import com.jaas.assosiacao.domain.Jogador;
import com.jaas.assosiacao.domain.Time;

public class JogadorTest02 {
    public static void main(String[] args){
        Jogador j1 = new Jogador("Isaac");
        Time t1 = new Time("Santos FC");
        j1.setTime(t1);
        j1.imprime();
    }
}
