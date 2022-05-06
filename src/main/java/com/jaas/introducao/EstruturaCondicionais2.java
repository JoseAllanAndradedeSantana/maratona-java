package com.jaas.introducao;

public class EstruturaCondicionais2 {
    public static void main(String[] args){
        //idade < 15 infatil
        //idade >= 15 && idade < 18 juvenil
        //idade >=18 adulto
        int age = 0;
        String category = "";
        if(age < 1) return;
        if(age < 15){
            category="Categoria Infantil";
        }else if(age >= 15 && age < 18){
            category="Categoria Juvenil";
        }else{
            category="Categoria Adulto";
        }
        System.out.println(category);
    }
}
