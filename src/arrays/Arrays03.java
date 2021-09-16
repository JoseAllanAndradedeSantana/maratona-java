package arrays;

public class Arrays03 {
	
	// Primeiro Array representa os meses e o segundo representa os dias dos meses
	
	public static void main(String[] args) {
		
		int [][] dias = new int[2][2];
	    dias[0][0] = 31;
	    dias[0][1] = 28;
	    
	    dias[1][0] = 31;
	    dias[1][1] = 30;
	    
	    for (int i = 0; i < dias.length; i++) {
	    	
	    	for (int j = 0; j < dias[i].length; j++) {
	    		
	    		System.out.println(dias[i][j]);
				
			}
			
		}
		
	}

}
