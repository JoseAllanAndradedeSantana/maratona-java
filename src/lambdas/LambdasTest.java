package lambdas;

import java.util.List;
import java.util.function.Consumer;

public class LambdasTest {
	
	//
	public static void main(String[] args) {

		List<String> str = List.of("Allan", "Jose", "Andrade","Santana");
		forEach(str, (String s) -> System.out.println(s));

	}

	private static <T> void forEach(List<T> list, Consumer<T> consumer) {

		for (T t : list) {

			consumer.accept(t);

		}
	}

}
