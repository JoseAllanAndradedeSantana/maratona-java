package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class ConsumerExemplo {
	
	public static void main(String[] args) {
		
		Consumer<Produto> imprimir = produto -> System.out.println(produto.nome);
		Produto produto1 = new Produto("Monitor",800, 0.15);
		Produto produto2 = new Produto("Notebook",7000, 0.15);
		Produto produto3 = new Produto("Mesa",880, 0.15);
		Produto produto4 = new Produto("Mouse",80, 0.15);
		Produto produto5 = new Produto("Cadeira",890, 0.15);
		imprimir.accept(produto5);
		
		List<Produto> produtos = Arrays.asList(produto1,produto2,produto3,produto4,produto5);
		produtos.forEach(System.out::println);
		produtos.forEach(imprimir);
		produtos.forEach(produtosPrecos -> System.out.println("R$ " +produtosPrecos.preco));
	}

}
