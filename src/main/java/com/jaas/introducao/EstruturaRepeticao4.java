package com.jaas.introducao;

public class EstruturaRepeticao4 {
    public static void main(String[] args){
        double valorTotal = 30000;
        for (int parcela = 1; parcela < valorTotal ; parcela++) {
            double valorParcela = valorTotal / parcela;
            if(valorParcela >= 1000){
                System.out.println("Parcela " + parcela + " R$"+valorParcela);
            }else{
                break;
            }
        }
    }
}
