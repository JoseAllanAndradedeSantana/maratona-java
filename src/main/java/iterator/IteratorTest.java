package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
	
	public static void main(String[] args) {
		List<Produto> produtos = new ArrayList<>();
		produtos.add(new Produto(1L,"Coca cola 350ml",20.0,15));
		produtos.add(new Produto(2L,"Coca cola 600ml",25.0,35));
		produtos.add(new Produto(3L,"Coca cola 1 Litro",30.0,55));
		produtos.add(new Produto(4L,"Coca cola 2 Litros",40.0,65));

		Iterator<Produto> produto = produtos.iterator();

		while(produto.hasNext()) {
			Produto prod =  produto.next();
			System.out.println(prod);
			if(prod.getPreco() < 30.0){
				produto.remove();
			}
		}
		System.out.print(produtos);
	}

}
