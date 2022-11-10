package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class DesafioFilter {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Lapis",1.00,0.20,2.00);
		Produto p2 = new Produto("Caneta",1.00,0.20,-10);
		Produto p3 = new Produto("Borracha",1.00,0.20,3.00);
		Produto p4 = new Produto("Giz",1.00,0.20,2.00);
		Produto p5 = new Produto("Caderno",1.00,0.20,2.00);
		Produto p6 = new Produto("Folha",1.00,0.20,2.00);
		
		List<Produto> produtos = Arrays.asList(p1,p2,p3,p4,p5,p6);
		
		Predicate<Produto> superPromocao = p -> p.desconto >= 20;
		Predicate<Produto> freteGratis = p -> p.valorFrete >= 3;
		
		
		produtos.stream().filter(freteGratis).map(p -> p.nome).forEach(System.out::println);
	}

}
