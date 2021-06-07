package lecture_classes.week9Review;

import java.util.ArrayList;

public class AddNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> nums = new ArrayList<>();
		nums.add("123");
		nums.add("505");
		nums.add("960");
		nums.add("420");
		
		System.out.println(sumOfEachString(nums));

	}
	
	
	public static ArrayList<Integer> sumOfEachString(ArrayList<String> nums){
		
		ArrayList<Integer> sums = new ArrayList<Integer>();
		
		for (int i = 0; i < nums.size(); i++) {
			
			int sum = 0;
			
			for (int j = 0; j < nums.get(i).length(); j++) {
				
				sum += Integer.parseInt(nums.get(i).substring(j,j+1));
				//sum+= Integer.parseInt(""+nums.get(i).charAt(j));
			}
			
			sums.add(sum);
			
			
		}
		
		return sums;
		
		
	}
	
	public static ArrayList<Integer> sumOfEachString2(ArrayList<String> nums){
		
		ArrayList<Integer> sums = new ArrayList<Integer>();
		
		for (int i = 0; i < nums.size(); i++) {
			
			int sum = 0;
			
			for (int j = 0; j < nums.get(i).length(); j++) {
				
				if (!Character.isDigit(nums.get(i).charAt(j))) {
					continue;
				}
				
				sum += Integer.parseInt(nums.get(i).substring(j,j+1));
				//sum+= Integer.parseInt(""+nums.get(i).charAt(j));
			}
			
			sums.add(sum);
			
			
		}
		
		return sums;
		
		
	}

}
