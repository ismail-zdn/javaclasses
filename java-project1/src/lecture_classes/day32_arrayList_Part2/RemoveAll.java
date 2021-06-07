package lecture_classes.day32_arrayList_Part2;

import java.util.ArrayList;

public class RemoveAll {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Integer> list1 = new ArrayList<>();
		list1.add(30);list1.add(12);list1.add(22);
		
		ArrayList<Integer> list2 = new ArrayList<>();
		list2.add(30);list2.add(33);list2.add(342);list2.add(7);
		
		System.out.println(list1);
		System.out.println(list2);
		
		
		//removes all matched values from list2
		list2.removeAll(list1);
		System.out.println(list2);

	}

}
