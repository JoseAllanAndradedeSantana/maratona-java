package polimorfismo.test;

import polimorfismo.repository.Repository;
import polimorfismo.service.RepositoryFile;

public class RepositoryTest {
    public static void main(String[] args) {
        Repository repository = new RepositoryFile();
        repository.salvar();
    }
}
