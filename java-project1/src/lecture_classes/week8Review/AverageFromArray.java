package lecture_classes.week8Review;

import java.util.Arrays;

public class AverageFromArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] arr = { 1,98,45,66};
		
		System.out.println(gerAvarage(arr));
		

	}
	
	public static int gerAvarage(int[] arr) {
		int sum = 0 ;
		for (int i : arr) {
			sum += i;
		}
		
		return sum/arr.length;
	}

}
