package io;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriter01 {
    public static void main(String[] args) {

        File file = new File("oracao.txt");

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
