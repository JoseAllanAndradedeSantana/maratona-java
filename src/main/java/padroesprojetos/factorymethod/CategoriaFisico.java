package padroesprojetos.factorymethod;

public class CategoriaFisico {
    public Produto novoProduto(){
        return new ProdutoFisico();
    }
}
