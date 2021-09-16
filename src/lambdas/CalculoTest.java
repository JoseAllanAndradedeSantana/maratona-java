package lambdas;

public class CalculoTest {
	
	public static void main(String[] args) {
		
		Calculo cal = new Soma();
		
		System.out.println(cal.executar(5, 8));
	}

}
