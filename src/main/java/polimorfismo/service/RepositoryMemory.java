package polimorfismo.service;

import polimorfismo.repository.Repository;

public class RepositoryMemory implements Repository {
    @Override
    public void salvar() {
        System.out.println("Saved Memory");
    }
}
