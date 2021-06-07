package assignments.replit;

import java.util.Arrays;

public class Arrays_127 {
	
	public static void main(String[] args) {
	    
	    int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 1};
 
	    //TODO. Write you code below this line. 
	    int count = 0;
	    System.out.println("Day 0 "+Arrays.toString(inhabitants));
	    for (int j = 0; !Arrays.equals(inhabitants, new int[8]) ; j++) {
			
	    	
	    	
	    	for(int i = 0 ; i<inhabitants.length ; i++){
	  	      
	  	      inhabitants[i] = inhabitants[i]/2;
	  	      
//	  	    if(inhabitants[i]<0) {
//	  	    	  inhabitants[i]=0;
//	  	      }     
	  	    }
	    	count++;
	    	System.out.println("Day "+count+" "+Arrays.toString(inhabitants));	
	    }
	       System.out.println("---- EXTINCT ----");    
	  }
}
