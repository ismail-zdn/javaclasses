package lecture_classes.day31_arrayList;

import java.util.ArrayList;

public class ArrayList_RemoveInteger {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> numbers = new ArrayList<>();
		
		System.out.println(numbers.size());
		
		System.out.println(numbers.isEmpty());
		
		System.out.println(numbers.size()==0);
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(100);
		
		System.out.println(numbers.toString());
		
		numbers.remove(1);
		
		System.out.println(numbers.toString());
//*****************************		
		// use object when you remove a specified value.
		Integer n1 = new Integer(10);
		numbers.remove(n1);
		System.out.println(numbers.toString());
//******************************
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
