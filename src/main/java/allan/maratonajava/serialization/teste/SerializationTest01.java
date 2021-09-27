package allan.maratonajava.serialization.teste;

import allan.maratonajava.serialization.domain.Aluno;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class SerializationTest01 {
    public static void main(String[] args) {
        Aluno aluno = new Aluno(1L,"Jose Allan","2810");
        serializar(aluno);
    }

    private static  void serializar(Aluno aluno){
        Path path = Paths.get("folder/aluno.ser");
        try (ObjectOutputStream oos = new ObjectOutputStream(Files.newOutputStream(path))){
            oos.writeObject(aluno);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
