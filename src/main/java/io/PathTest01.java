package io;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        Path p1 = Paths.get("C:\\Users\\allan\\IdeaProjects\\maratona-java\\arquivo\\oracao.txt");
        System.out.println(p1.getFileName());
    }
}
