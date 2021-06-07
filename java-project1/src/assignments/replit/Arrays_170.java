package assignments.replit;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_170 {
	
	public static void main(String[] args) {
	    
	    int[] inhabitants = {3, 6, 0, 4, 3, 2, 7, 0};
	    
	      int count = 0;
	      int[] newList = Arrays.copyOf(inhabitants, inhabitants.length);
		    System.out.println("Day 0 "+Arrays.toString(inhabitants));
		     
	    	
		    for (int j = 0; !Arrays.equals(newList, new int[8]) ; j++) {
		    
		    	inhabitants = Arrays.copyOf(newList, inhabitants.length);
		    	for(int i = 0 ; i<inhabitants.length ; i++){
		    	  
//		    	  if((i-1) >= 0 && (i+1) <= (inhabitants.length-1)){
		    	    
//		    	    if(inhabitants[i-1] < 1 || inhabitants[i+1] < 1){
//		    	      
//		    	      
//		    	    }
		    		  
//		    	  }
		    		
		    	  if(i == 0){
		    		  if (inhabitants[1] == 0) {
		    			  newList[0] = inhabitants[0]/2;
//		    			  a = true;
					}
		    	      continue;
		    	  }else if(i == inhabitants.length-1){
		    		  if (inhabitants[inhabitants.length-2] == 0) {
		    			  newList[inhabitants.length-1] = inhabitants[inhabitants.length-1]/2;
//		    			  a = true;
					}
		    		  continue;
		    	  }else if(inhabitants[i-1] == 0 || inhabitants[i+1] == 0){
		    		  newList[i] = inhabitants[i]/2;
//		    		  a = true;
		    	  }
//		    	  if (a) {
//			    		inhabitants[i] = inhabitants[i]/2;
//					}
//		    	  
		  	    }
		    	
		    	
		    	count++;
		   
		    	System.out.println("Day "+count+" "+Arrays.toString(newList));	
		    }
		       System.out.println("---- EXTINCT ----"); 

	  }
}

/*
Day 0 [3, 6, 0, 4, 3, 2, 7, 0]
Day 1 [3, 3, 0, 2, 3, 2, 3, 0]
Day 2 [3, 1, 0, 1, 3, 2, 1, 0]
Day 3 [3, 0, 0, 0, 3, 2, 0, 0]
Day 4 [1, 0, 0, 0, 1, 1, 0, 0]
Day 5 [0, 0, 0, 0, 0, 0, 0, 0]
---- EXTINCT ----*/
