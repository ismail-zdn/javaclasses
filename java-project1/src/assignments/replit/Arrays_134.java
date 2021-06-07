package assignments.replit;

import java.util.Arrays;

public class Arrays_134 {
	public static void main(String[] args) {
	    //
//		4
//		7
//		-1
//		0
//		3
//		12
//		-1
//		0
//		3
//		3
//		3
//		10
//		12
			int[] inner = {-1,0,3,12};
			int[] outer = {-1,0,3,3,3,10,12};
			
			Arrays.sort(inner);
			Arrays.sort(outer);
			//WRITE YOUR CODE HERE
			int count = 0;
	  for(int out : outer){
	    for(int i = 0 ; i < inner.length ; i++){
	      if(out == inner[i]){
	        count++;
	        inner[i]=999;
	      }
	    }
	    
	  }
			if(count==inner.length){
	      System.out.println(true);
	    }else{
	      System.out.println(false);
	    }
			
			
			
	  }

}
