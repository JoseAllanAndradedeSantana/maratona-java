package streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PrintObject {
	public static void main(String[] args) {
		
		List<String> aprovados = Arrays.asList("Allan","Mariane","Isaque");
		
		 
		for(int i = 0; i < aprovados.size(); i++) {
			System.out.println(aprovados.get(i));
		}
		
		for (String nome : aprovados) {
			System.out.println(nome);
		}
		
		Stream<String> stream = aprovados.stream();
		stream.forEach(System.out::println);
		
		

	}
}
