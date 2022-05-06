package com.jaas.introducao;

public class EstruturaCondicionais3 {
    public static void main(String[] args){
        double salary = 6000;
        String messageDoar = "Eu vou Doar";
        String messageNaoDoar = "Eu nao vou Doar";
        String resultado = salary > 5000 ? messageDoar : messageNaoDoar;
        System.out.println(resultado);
    }
}
