package lambdas;

import java.util.function.Predicate;

public class PredicateComposicao {
	
	public static void main(String[] args) {
		
		Predicate<Integer> isPar = 
				numero -> numero % 2 == 0;
				
		Predicate<Integer> tresDigitos =
				numero -> numero >= 100 && numero <= 999;
		
				
		System.out.println(isPar.and(tresDigitos).test(100));
		System.out.println(tresDigitos.test(500));
	}

}
