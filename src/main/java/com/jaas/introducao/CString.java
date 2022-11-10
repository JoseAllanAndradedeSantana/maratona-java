package com.jaas.introducao;

import java.util.Scanner;

public class CString {
    public static void main(String[] agrs){
        String name;
        Scanner en = new Scanner(System.in);
        System.out.print("Enter with the your name full:");
        name = en.nextLine();
        System.out.println(name);
    }
}
