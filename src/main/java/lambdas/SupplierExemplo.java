package lambdas;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

public class SupplierExemplo {

	public static void main(String[] args) {
		
		Supplier<List<String>> lista = 
				() -> Arrays.asList("Allan","Mariane","Isaque");
				
				System.out.println(lista.get());
	}
}
