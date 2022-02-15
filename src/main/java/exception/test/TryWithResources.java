package exception.test;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {

    }

    private static void lerArquivo() {
        Reader reader = null;
        try {
            reader = new BufferedReader(new FileReader("oracao.txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                if (reader != null) {
                    reader.close();
                }
            } catch (IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
