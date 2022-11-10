package allan.maratonajava.colecoes.test;

import iterator.Produto;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Produto> produtos = new HashSet<>();
        produtos.add(new Produto(1L,"Coca cola 350ml",20.0,15));
        produtos.add(new Produto(2L,"Coca cola 600ml",25.0,35));
        produtos.add(new Produto(3L,"Coca cola 1 Litro",30.0,55));
        produtos.add(new Produto(4L,"Coca cola 2 Litros",40.0,65));

        for (Produto produto:produtos) {
            System.out.println(produto);

        }
    }
}
