package lecture_classes.week9Review;

import java.util.ArrayList;
import java.util.Arrays;

public class SecondMaxNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {8,75,87527,7537,77};
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		nums.add(10);
		nums.add(5);
		nums.add(4);
		nums.add(5);
		nums.add(2);
		System.out.println(getSecondMax(nums));
		

	}
	
	public static int getSecondMax(ArrayList<Integer> numbers) {
		//default value
		int max= Integer.MIN_VALUE;
		int secondMax = Integer.MIN_VALUE;
		
		for (int num : numbers) {
			
			if (num > max) {
				secondMax = max;
				max = num;
			}
			
			if (num > secondMax && num < max) {
				secondMax = num;
			}
			
		}
		
		return secondMax;
		
		
	}

}