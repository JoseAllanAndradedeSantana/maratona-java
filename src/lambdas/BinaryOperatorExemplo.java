package lambdas;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

public class BinaryOperatorExemplo {

	public static void main(String[] args) {

		BinaryOperator<Double> media = (Double nota1, Double nota2) -> (nota1 + nota2) / 2;
        System.out.println(media.apply(9.8, 9.0));
        
        
        BiFunction<Double, Double, String> resultado = (nota1, nota2) -> {
        	double notaFinal = (nota1+nota2) /2;
        	return notaFinal >= 7 ? "Aprovado" : "Reprovado";
        };
        
        System.out.println(resultado.apply(10.0, 9.8));
	}

}
