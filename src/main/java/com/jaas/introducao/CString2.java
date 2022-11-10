package com.jaas.introducao;

import java.time.LocalDateTime;
import java.util.Scanner;

/*
Pratica
Crie variaveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:
Eu <nome>, morando no endereco <endereco>,
confirmo que recebi o salario de <salario> na data <data>
 */
public class CString2 {
    public static void main(String[] args) {
        String name;
        String adress;
        double salary;
        LocalDateTime date = LocalDateTime.now();
        Scanner en = new Scanner(System.in);
        System.out.print("Enter with the your full name: ");
        name = en.nextLine();
        System.out.print("Enter with the your adress: ");
        adress = en.nextLine();
        System.out.print("Enter the your Salary: ");
        salary = en.nextDouble();
        String report = "I " + name + ", living in adress " + adress + " confirm that received the wage of " +salary + " on date " + date;
        System.out.println(report);
    }
}
