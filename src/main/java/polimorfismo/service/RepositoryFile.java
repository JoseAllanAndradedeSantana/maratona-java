package polimorfismo.service;

import polimorfismo.repository.Repository;

public class RepositoryFile implements Repository {
    @Override
    public void salvar() {
        System.out.println("Saved File");
    }
}
