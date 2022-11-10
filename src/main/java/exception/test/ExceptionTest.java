package exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest extends Throwable {
    public static void main(String[] args) {
        criarArquivo();
    }

    private static void criarArquivo() {
        File file = new File("arquivo\\oracao.txt");
        try {
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado com sucesso " + isCriado);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
