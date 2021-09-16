package arrays;

public class Arrays04 {
	
public static void main(String[] args) {
		
		int [][] dias = new int[2][2];
	    dias[0][0] = 31;
	    dias[0][1] = 28;
	    
	    dias[1][0] = 31;
	    dias[1][1] = 30;
	 
	    for (int[] is : dias) {
	    	
	    	for (int is2 : is) {
	    		
	    		System.out.println(is2);
				
			}
			
		}
		
	}

}
