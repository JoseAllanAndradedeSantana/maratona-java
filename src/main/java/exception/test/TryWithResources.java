package exception.test;

import java.io.*;

public class TryWithResources {
    public static void main(String[] args) {
        lerArquivo();
    }

    private static void readFile(){
        try(Reader reader = new BufferedReader(new FileReader("oracao.txt"))){

        }catch (IOException e){
            e.printStackTrace();
        }
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
