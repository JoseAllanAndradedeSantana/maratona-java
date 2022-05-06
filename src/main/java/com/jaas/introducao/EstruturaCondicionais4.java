package com.jaas.introducao;

public class EstruturaCondicionais4 {
    public static void main(String[] args){
        double salarioAnual = 70000;
        double primeiraFaxia = 9.70 / 100;
        double segundaFaxia = 37.35 / 100;
        double terceiraFaxia = 49.50/ 100;
        double valorImposto;

        if(salarioAnual <= 34712){
            valorImposto = salarioAnual * primeiraFaxia;
        }else if(salarioAnual >= 34713 && salarioAnual <= 68507){
            valorImposto = salarioAnual * segundaFaxia;
        }else{
            valorImposto = salarioAnual * terceiraFaxia;
        }
        System.out.println("R$"+valorImposto);
    }
}
