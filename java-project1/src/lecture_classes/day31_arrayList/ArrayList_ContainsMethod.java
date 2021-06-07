package lecture_classes.day31_arrayList;

import java.util.ArrayList;

public class ArrayList_ContainsMethod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list1 = new ArrayList<>();
		
		list1.add("Jan");
		list1.add("Feb");
		list1.add("Mar");
		list1.add("Apr");
		list1.add("May");
		
		System.out.println(list1.toString());
		
		ArrayList<String> list2 = list1;
		System.out.println(list1.toString());
		
		// copy all values from list1
		
		ArrayList<String> months = new ArrayList<String>(list1);
		months.add("Jun");
		months.add("July");
		months.add("Aug");
		System.out.println(months);
		
		System.out.println(months.contains("Jan")); //true
		System.out.println(months.contains("Dec")); //false
		
		// how to check if Feb is in second positon
		System.out.println(months.indexOf("Feb")==1); //true
		System.out.println(months.get(1).equals("Feb")); // true
		
		list1.add("Jan"); //although there are two Jan it is True !!!
		System.out.println(list1);
		System.out.println(months);
		
		if(months.containsAll(list1)) {
			System.out.println("Months has all list1");
		}else {
			System.out.println("Some values missing.");
		}
		

	}

}
