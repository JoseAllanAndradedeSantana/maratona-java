package com.jaas.blocoinicializacao.domain;

public class Novela {
    private String nome;
    private int[] episodios = {1,2,3,4,5,6,7,8,9,10,11,12};
    {

    }

    public Novela(){
        System.out.println(episodios);
        for(int episodio : episodios){
            System.out.print(episodio);
        }
    }
}
