package padroesprojetos.factorymethod;

public class CategoriaDigital extends CategoriaFisico {
    public Produto novoProduto(){
        return new ProdutoDigital();
    }
}
