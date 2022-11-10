package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriter01 {
    public static void main(String[] args) {
        File file = new File("oracao.txt");
        Scanner en = new Scanner(System.in);

        extracted(file);


    }

    private static void extracted(File file) {
        try {
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.write("Senhor Jesus obrigado por tudo que vem fazendo e minha vida !!!");
            System.out.println("File created with success!!!");
            fileWriter.flush();
            fileWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
