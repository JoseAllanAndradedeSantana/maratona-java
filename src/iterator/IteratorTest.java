package iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest {
	
	public static void main(String[] args) {
		List<Produto> produto = new ArrayList<>();
		produto.add(new Produto(1L,"Coca cola 350ml",20.0,15));
		produto.add(new Produto(1L,"Coca cola 600ml",25.0,35));
		produto.add(new Produto(1L,"Coca cola 1 Litro",30.0,55));
		produto.add(new Produto(1L,"Coca cola 2 Litros",40.0,65));
		
		Iterator<Produto> produtos = produto.iterator();
		while(produtos.hasNext()) {
			System.out.println(produtos.next());
			Produto prod = new Produto();
			if(prod.getPreco() < 25){

				produtos.remove();

			}

		}


		
		//produtos.removeIf();
	}

}
