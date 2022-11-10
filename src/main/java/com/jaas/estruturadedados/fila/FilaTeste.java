package com.jaas.estruturadedados.fila;

import java.util.List;

public class FilaTeste {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();

        String teste = "28,10,11,13,16,12";
        System.out.println(teste);
        List<String> ftm = List.of(teste.split(","));
        System.out.println(ftm.get(1));

        minhaFila.enqueue("primeiro");
        minhaFila.enqueue("segundo");
        minhaFila.enqueue("terceiro");
        minhaFila.enqueue("quarto");
        minhaFila.enqueue("quinto");
        minhaFila.enqueue("sexto");

        System.out.println(minhaFila);
        System.out.println(minhaFila.dequeue());
    }
}
