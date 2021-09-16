package lambdas;

import java.util.function.Function;

public class FunctionExemplo {

	public static void main(String[] args) {
		Function<Integer, String> parOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

		System.out.println(parOuImpar.apply(35));
		
		Function<String, String> resultado = valor -> "O número é " + valor;
		
		String resultadoFinal = parOuImpar.andThen(resultado).apply(25);
		System.out.println(resultadoFinal);

	}

}
