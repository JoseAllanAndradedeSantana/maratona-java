package com.jaas.introducao;

public class Arrays1 {
    public static void main(String[] args){
        int[] idades = new int[3];
        idades[0] = 32;
        idades[1] = 33;
        idades[2] = 34;
        for (int i = 0; i < idades.length; i++) {
            System.out.println(idades[i]);
        }
        for (int num:idades){
            System.out.println(num);
        }
    }
}
