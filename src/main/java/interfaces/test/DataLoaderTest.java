package interfaces.test;

import interfaces.domain.DatabaseLoager;
import interfaces.domain.FileLoader;

public class DataLoaderTest {
    public static void main(String[] args) {
        DatabaseLoager databaseLoager = new DatabaseLoager();
        FileLoader fileLoader = new FileLoader();
        databaseLoager.load();
        databaseLoager.remove();
        fileLoader.load();
        fileLoader.remove();
    }
}
