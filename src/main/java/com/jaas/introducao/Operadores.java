package com.jaas.introducao;

public class Operadores {
    // + - / * % < > <= >= == != &&(and) ||(or) !
    public static void main(String[] args){
        int numberOne = 10;
        int numberTwo = 2;
        int result = numberOne + numberTwo;
        int number = 21 % 2;
        int age = 35;
        double salary = 3500;
        boolean isLegalOlderThanThirty = age >= 30 && salary >= 4612;
        boolean isLegalYoungerThanThirty = age < 30 && salary >= 3381;

        System.out.println(isLegalOlderThanThirty);
        System.out.println(isLegalYoungerThanThirty);
        System.out.println(number);
        System.out.println(result);



    }
}
