package lecture_classes.week8Review;

import java.util.Arrays;

public class Array2DBiggestNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [][] numbers = {
				{15,49,666},
				{15,49,555},
				{15,49,444},
				{15,49,333},
				{15,49,60},
		};
		
		System.out.println(Arrays.toString(biggestValues(numbers)));
		

	}
	
	public static int[] biggestValues (int [][] arr) {
		
		int[] biggest = new int[arr.length];
		
		for (int i = 0; i < arr.length; i++) {
			
			int max = arr[i][0];
			
			for (int num : arr[i]) {
				
				if (num>max) {
					max=num;
				}
			}
			
			biggest[i] = max;
			
		}
		
		return biggest;
	}

}
