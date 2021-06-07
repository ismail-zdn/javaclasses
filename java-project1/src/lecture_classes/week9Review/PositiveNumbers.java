package lecture_classes.week9Review;

import java.util.ArrayList;

public class PositiveNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(getPosNum(9,5,-5,-3,5));

	}
	
	public static ArrayList<Integer> getPosNum(int ... arr){
		
		
		ArrayList<Integer> nums = new ArrayList<>();
		
		for (int each : arr) {
			if (each>0) {
				nums.add(each);
			}
		}
		
		return nums;
		
		
		
		
		
	}

}
