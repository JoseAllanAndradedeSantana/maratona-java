package polimorfismo.test;

import polimorfismo.repository.Repository;
import polimorfismo.service.RepositoryFile;

import java.util.ArrayList;
import java.util.List;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new RepositoryFile();
        repository.salvar();
        List<String> list = new ArrayList<>();
        list.add("Jose Allan Andrade de Santana");
        list.add("Mariane Santana da Silva Andrade");
        list.add("Isaac Santana da Silva Andrade");

        System.out.println(list);

        list.stream().forEach(System.out::println);

    }
}
