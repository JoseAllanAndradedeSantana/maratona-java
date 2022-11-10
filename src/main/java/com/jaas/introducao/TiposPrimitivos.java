package com.jaas.introducao;

import java.util.Scanner;

public class TiposPrimitivos {
    public static void main(String[] args){
        // int , double, float, char, byte, short, long, boolean
        int age;
        double wageDouble = 4000;
        float wageFloat = 4500;
        byte ageByte = 127;
        short ageShort = 10;
        boolean trueBoolean = true;
        boolean falseBoolean = false;
        long numberBig = 100000;
        char word = 'M';
        Scanner en = new Scanner(System.in);
        System.out.print("Enter your age: ");
        age = en.nextInt();
        System.out.println("The age is "+age+" years");

    }
}
