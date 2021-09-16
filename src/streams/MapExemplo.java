package streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MapExemplo {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;		
		List<String> marcas = Arrays.asList("bmw ","honda "," audi");
		marcas.stream().map(marca -> marca.toUpperCase()).forEach(print);;
	}

}
