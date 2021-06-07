package lecture_classes.day32_arrayList_Part2;

import java.util.ArrayList;

public class EqualMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> friends1 = new ArrayList<>();
		ArrayList<String> friends2 = new ArrayList<>();
		
		friends1.add("Ali");
		friends1.add("Mehmet");
		
		friends2.add("Ali");
		friends2.add("Mehmet");
		
		System.out.println(friends1.equals(friends2)); // true
		
		System.out.println(friends1==friends2); // false

	}

}
