package streams;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class CriandoStream {
	
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		Stream<String> langs = Stream.of("Java ","Node.js ","Python ","SQL");
		
		langs.forEach(print);
	}

}
