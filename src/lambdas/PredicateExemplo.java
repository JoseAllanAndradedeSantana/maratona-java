package lambdas;

import java.util.function.Predicate;

public class PredicateExemplo {
	
	public static void main(String[] args) {
		Predicate<Produto> isCaro = prod -> prod.preco > 1000;
		
		Produto produto = new Produto("Notebook",1001,0.15);
		System.out.println(isCaro.test(produto));
	}
	

}
