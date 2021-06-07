package lecture_classes.day46_collection_Part1;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class ArrayVSArrayList {

	public static void main(String[] args) {


		int[] numsArray = {30,50,00,50};

		String [] days = new String[7];
		days[0] = "Monday";
		
		Object[] obj = {2,"Apple",false};
		
		ArrayList<Integer> list1 = new ArrayList<>();
		List<Integer> list2 = new ArrayList<>();
		Collection<Integer> lis3 = new ArrayList<>();
		
		list1.add(58);
		list1.add(564);
		list1.add(63);
		
		System.out.println(numsArray[0]);
		System.out.println(list1.get(0));
		
		
	}

}
