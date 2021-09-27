package lambdas;

public class CalculoTest02 {
	
	public static void main(String[] args) {
		
		Calculo soma = (a,b) -> {
			return a + b;
		};
		
		System.out.println(soma.executar(10, 11));
	}

}
