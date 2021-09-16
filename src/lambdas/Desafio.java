package lambdas;

import java.util.Locale;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Desafio {
	
	public static void main(String[] args) {
		
		
		
		//Calcula  o preço com desconto
		
		
		
		//Calcula Imposto
		Function<Produto,Double> precoFinal = prod -> prod.preco *(1-prod.desconto);
		UnaryOperator<Double> impostoMunicipal = preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete = preco -> preco >= 3000 ? preco+100 : preco+50;
		UnaryOperator<Double> arredondar = preco ->  Double.parseDouble(String.format(Locale.ENGLISH,"%.2f", preco));
		Function<Double, String> formatar = preco -> ("RS "+ preco).replace(".", ",");
		Function<Produto,Double> precoFinal2 = prod -> prod.preco *(1-prod.desconto);
		UnaryOperator<Double> impostoMunicipal2 = preco -> preco >= 2500 ? preco * 1.085 : preco;
		UnaryOperator<Double> frete2 = preco -> preco >= 3000 ? preco+100 : preco+50;
		UnaryOperator<Double> arredondar2 = preco ->  Double.parseDouble(String.format(Locale.ENGLISH,"%.2f", preco));
		Function<Double, String> formatar2 = preco -> ("RS "+ preco).replace(".", ",");
		Produto produto = new Produto("Ipad", 3235.89, 0.13);
		Produto produto2 = new Produto("Ipad", 3235.99, 0.13);
		String preco = precoFinal
				.andThen(impostoMunicipal)
				.andThen(frete)
				.andThen(arredondar)
				.andThen(formatar)
				.apply(produto2);
		String preco2 = precoFinal2
				.andThen(impostoMunicipal2)
				.andThen(frete2)
				.andThen(arredondar2)
				.andThen(formatar2)
				.apply(produto);
		
		System.out.println(preco);
		System.out.println(preco2);
	}

}
