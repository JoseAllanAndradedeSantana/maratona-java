package io;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferWriteTest01 {
    public static void main(String[] args) {
        File newFile = new File("oracoes.txt");
        try(FileWriter fw = new FileWriter(newFile,true);
            BufferedWriter bw = new BufferedWriter(fw)){
            bw.write("Obrigado Deus!!");
            bw.newLine();
            bw.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
