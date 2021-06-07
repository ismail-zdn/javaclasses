package lecture_classes.week9Review;

import java.util.ArrayList;

public class MergeArrayWithArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] one = {9,9,9,9,9,9,9,9,9,9,9};
		int[] two = {4,4,4,4,4,4};
		
		System.out.println(mergeArrays(one, two));

	}

	// you can just one var Args int ... one
	public static ArrayList<Integer> mergeArrays(int [] one, int[] two){
		
		ArrayList<Integer> numbers = new ArrayList<>();
		int max = Math.max(one.length, two.length);
		for (int i = 0; i < max; i++) {
			if (i < one.length) {
				numbers.add(one[i]);	
			}
			if (i < two.length) {
				numbers.add(two[i]);
			}
			
			
		}
		
		
		return numbers;
		
		
	}
}
