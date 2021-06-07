package assignments.replit;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_130 {
	public static void main(String[] args) {
	  
	    
	    int[] nums = {1,2,3,4,5,6};
	 
	    //WRITE YOUR CODE HERE
	   
	    int newSize = nums.length;
	    
	    int[] newNums = new int[nums.length];
	    for(int i = 0 ; i < nums.length ; i++){
	    	newNums[newSize-1] = nums[i];
	      newSize--;
	    }
	    
	    System.out.println(Arrays.toString(newNums));
	    

	  }

}
