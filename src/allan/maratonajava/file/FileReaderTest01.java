package allan.maratonajava.file;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("");
        try (FileReader fr = new FileReader(file)) {
            System.out.println(fr.read());
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
