package lecture_classes.day47_collection_Part2;

import java.util.*;

public class LoopArrayList {

	public static void main(String[] args) {
		
		List<Integer> nums = new ArrayList<>();
		nums.add(50);
		nums.add(45);
		nums.add(1120);
		nums.add(150);
		nums.add(24);
		nums.add(58);
		
		//looping using for each loop
		for(int n : nums) {
			System.out.print(n+" | ");
		}
		
		System.out.println();
		
		//looping using regular for
		for (int i = 0; i < nums.size(); i++) {
			System.out.print(nums.get(i)+" | ");
		}
		
		System.out.println();
		
		//looping using forEach method. Lambda expression
		nums.forEach(n -> System.out.print(n + " | "));
		
		System.out.println();
		
		nums.removeIf(n-> n<50);
		
		nums.forEach(n-> System.out.print(n+ " | "));
		
		
		
		
		
		
		
		
		
		
		
		
	}
}
