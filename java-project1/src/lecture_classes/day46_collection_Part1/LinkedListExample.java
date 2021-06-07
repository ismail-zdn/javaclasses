package lecture_classes.day46_collection_Part1;

import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	
	public static void main(String[] args) {
		
		List<Integer> list = new LinkedList<>();
		list.add(10);
		list.add(50);
		list.add(550);
		list.add(450);
		
		System.out.println(list.get(0));
		System.out.println(list.get(1));
		
		System.out.println(((LinkedList)list).getFirst());
		
		((LinkedList)list).addFirst(1);
		((LinkedList)list).addLast(9999);
		
		
		
		
	}

}
