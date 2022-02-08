package io;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args){
        File file = new File("oracoes.txt");
        try {
            boolean isCreated = file.createNewFile();
            System.out.println("O arquivo foi criado " + file.getAbsolutePath());
            System.out.println("O arquivo foi modificado " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()).toLocalDateTime());
            if(isCreated){
                System.out.println("File Created "+ isCreated);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
