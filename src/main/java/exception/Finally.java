package exception;

import java.util.Scanner;

public class Finally {
	
	public static void main(String[] args) {
		try {
			
			Scanner entrada = new Scanner(System.in);
			double result = 7/entrada.nextInt();
			System.out.println(result);
			entrada.close();
		}catch(Exception e){
			
			e.printStackTrace();
			
		}
	}

}
