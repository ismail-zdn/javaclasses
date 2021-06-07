package lecture_classes.week17;

import java.util.ArrayList;
import java.util.List;

public class arrayListMulti {

	public static void main(String[] args) {
		
		List<String> l1 = new ArrayList<>();
		l1.add("hebele from l1");
		l1.add("hebele from l1");
		List<String> l2 = new ArrayList<>();
		List<String> l3 = new ArrayList<>();
		l3.add("hübele from l3");
		
		ArrayList<String> l4 = new ArrayList<>();
		l4.add("a");
		l4.add("a");
		System.out.println(l4.get(0));
		System.out.println(l4.get(1));
		
		List<List<String>> multiList = new ArrayList<>();
		
		multiList.add(l1);
		multiList.add(l2);
		multiList.add(l3);
		
		System.out.println(multiList.get(0).get(0));
		System.out.println(multiList.get(0).get(1));
		System.out.println(multiList.get(2).get(0));
		
	}
}
