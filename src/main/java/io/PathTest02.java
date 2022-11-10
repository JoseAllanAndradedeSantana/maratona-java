package io;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("arquivo");
        if(Files.notExists(path)){
            Path direct = Files.createDirectory(path);
        }

        Path paths = Paths.get("Ano/Mes/dia");
        if(Files.notExists(paths)){
            Path direct = Files.createDirectories(paths);
        }

        Path file = Paths.get(paths.toString(),"file.txt");
        if(Files.notExists(file)){
            Path isFileCreated = Files.createFile(file);
        }
    }
}
