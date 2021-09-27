package allan.maratonajava.file;

import java.io.File;
import java.io.IOException;

public class FileTest01 {
    public static void main(String[] args) {
        File fileDiretorio = new File("folder");
        boolean isDiretorioCriado = fileDiretorio.mkdir();
        System.out.println(isDiretorioCriado);
        File fileArquivoDiretorio = new File(fileDiretorio,"arquivo1.txt");
        boolean isFileCreated = false;
        try {
            isFileCreated = fileArquivoDiretorio.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(isFileCreated);
    }
}
