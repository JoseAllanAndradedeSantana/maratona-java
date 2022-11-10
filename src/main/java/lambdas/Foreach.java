package lambdas;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Allan","Mariane","Isaac");
		System.out.println("For Tradicional !!!");
		for (String nome : aprovados) {
			System.out.println("Aprovado: "+nome);
		}
		System.out.println("-----------------------------------------");
		System.out.println("Lambdas01 !!!");
		aprovados.forEach((nome) -> {System.out.println(" " + nome);});
		System.out.println("-----------------------------------------");
		System.out.println("Method References !!!");
		aprovados.forEach(System.out::println);
		System.out.println("Method References #02 !!!");
		aprovados.forEach(Foreach::meuImprimir);
	}
	
	static void meuImprimir(String nome) {
		System.out.println("o/ "+nome);
	}
	

}
