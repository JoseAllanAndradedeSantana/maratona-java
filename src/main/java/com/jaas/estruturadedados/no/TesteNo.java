package com.jaas.estruturadedados.no;

public class TesteNo {
    public static void main(String[] args) {
        No<String> no1 = new No<>("conteudo No1");
        No<String> no2 = new No<>("conteudo No2");
        No<String> no3 = new No<>("conteudo No3");
        No<String> no4 = new No<>("conteudo No4");

        no1.setProximoNo(no2);
        no2.setProximoNo(no3);
        no3.setProximoNo(no4);

        System.out.println(no1);
        System.out.println(no1.getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo());
        System.out.println(no1.getProximoNo().getProximoNo().getProximoNo().getProximoNo());
    }

}
