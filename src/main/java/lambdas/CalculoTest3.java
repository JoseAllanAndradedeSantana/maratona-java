package lambdas;

import java.util.function.BinaryOperator;

public class CalculoTest3 {

	public static void main(String[] args) {

		BinaryOperator<Double> soma = (a, b) -> {
			return a + b;
		};
		System.out.println(soma.apply(5.0, 6.0));
	}
}