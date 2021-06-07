package lecture_classes.week8Review;

import java.util.Arrays;

public class FindUniqueElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = {15,49,15,49,6,9,6,7,7,85};
		
		System.out.println(Arrays.toString(findUniqueElements(numbers)));
		

	}
	
	public static String[] findUniqueElements(int[] arr) {
		
		String result = "";
		
		for (int i = 0; i < arr.length; i++) {
			
			int count = 0;
			for (int j = 0; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					count++;
				}
			}
			
			if (count == 1) {
				result = result+arr[i]+" ";
			}
		}
		
		return result.trim().split(" ");
	}

}
