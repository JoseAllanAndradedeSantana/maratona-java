package polimorfismo.service;

import polimorfismo.repository.Repository;

public class RepositoryDatabase implements Repository {
    @Override
    public void salvar() {
        System.out.println("Saved Database");
    }
}
