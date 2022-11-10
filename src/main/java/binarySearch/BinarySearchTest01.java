package binarySearch;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class BinarySearchTest01 {
	
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList();
		Scanner en = new Scanner(System.in);
		Integer e = en.nextInt();
		numeros.add(5);
		numeros.add(8);
		
		Collections.sort(numeros);
		System.out.println(Collections.binarySearch(numeros, e));
		
	}

}
