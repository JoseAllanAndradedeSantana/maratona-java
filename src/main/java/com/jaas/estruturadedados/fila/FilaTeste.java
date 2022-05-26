package com.jaas.estruturadedados.fila;

public class FilaTeste {
    public static void main(String[] args) {
        Fila<String> minhaFila = new Fila<>();

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
