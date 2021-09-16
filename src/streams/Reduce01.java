package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

public class Reduce01 {
	
	public static void main(String[] args) {
		List<Integer> number = Arrays.asList(1,2,3,4,5);
		BinaryOperator<Integer> soma = (ac,n) -> ac + n;
		
		int result = number.stream().reduce(soma).get();
		System.out.println(result);
		
		number.stream()
		.filter(n -> n > 3)
		.reduce(soma).ifPresent(System.out::println);
		
	}

}
