package com.jaas.introducao;

public class EstruturaRepeticao1 {
    //while do while for
    public static void main(String[] args){
        int count = 0;
        while(count <= 10){
            System.out.println(count);
            count++;
        }
        do {
            System.out.println("Dentro do while: "+count);
            count++;
        }while (count < 20);

        for(int i =0; i < 10; i++){
            System.out.println(i);
        }
    }
}
