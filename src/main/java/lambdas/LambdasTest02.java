package lambdas;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdasTest02 {
	public static void main(String[] args) {
		List<String> str = List.of("Allan", "Jose", "Andrade","Santana");
		List<Integer> inter = map(str, (String s) -> s.length());
		List<String> map = map(str, s -> s.toUpperCase());
		System.out.println(inter);
		System.out.println(map);
	}
	private static <T,R> List<R> map(List<T> list, Function<T, R> function){
		List<R> result = new ArrayList<>();
		for (T e : list) {
			R r = function.apply((T) e);
			result.add(r);
		}
		return result;
	}
}
