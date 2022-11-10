package allan.maratonajava.file;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class FileWriteTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        try (FileWriter fw = new FileWriter(file, true)) {
            fw.write("Jesus Cristo Eu te amoo");
            fw.write("\n");
            fw.write("\n");
            fw.write("Jesus Cristo Eu te amoo");
            fw.flush();
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
