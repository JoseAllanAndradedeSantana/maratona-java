package io;

import java.io.File;
import java.io.IOException;
import java.time.LocalDate;

public class FileTest02 {
    public static void main(String[] args) {
        File fileDiretorio = new File("pasta");
        boolean mkdir = fileDiretorio.mkdir();
        System.out.println(mkdir);
        File file = new File(fileDiretorio,"arquivo.txt");
        createDirectorio();
        try {
            boolean newFile = file.createNewFile();
            System.out.println(newFile);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static void createDirectorio(){
        try {
            LocalDate date = LocalDate.now();
            String year = String.valueOf(date.getYear());
            File folder = new File(year);

            folder.mkdir();
            File file = new File(folder,date.getMonth().toString());
            file.mkdir();

            File xml = new File(file,date + ".xml");
            xml.createNewFile();

        }catch (Exception ex){
            ex.printStackTrace();
        }
    }
}
