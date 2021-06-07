package lecture_classes.day31_arrayList;

import java.util.ArrayList;

public class ArrayListIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creatin an ArrayList
		ArrayList<String> names = new ArrayList<>();
		
		ArrayList<Integer> nums = new ArrayList<>();

		
		// Assigning Values
		
		names.add("Ismail");
		names.add("Ozden");
		names.add("Istanbul");
		names.add("Turkey");
		
		nums.add(1994);
		nums.add(26);
		nums.add(new Integer("100"));
		
		
		//Reading from ArrayList
		
		System.out.println(names.get(0));
		System.out.println(names.get(2));
		System.out.println(nums.get(0));
		
		System.out.println("Names count: "+names.size());
		System.out.println("Nums count: "+nums.size());
		
		System.out.println(names.toString());
		System.out.println(nums.toString());
		
		
	}

}
