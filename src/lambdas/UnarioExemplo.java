package lambdas;

import java.util.function.UnaryOperator;

public class UnarioExemplo {
	
	public static void main(String[] args) {
		
		UnaryOperator<Integer> maisDois = numero -> numero + 2;
		UnaryOperator<Integer> vezesDois = numero -> numero * 2;
		UnaryOperator<Integer> aoQuadrado = numero -> numero * numero;
		
		int resultado1 = maisDois.andThen(vezesDois).andThen(aoQuadrado).apply(0);
		
		System.out.println(resultado1);
	}

}
