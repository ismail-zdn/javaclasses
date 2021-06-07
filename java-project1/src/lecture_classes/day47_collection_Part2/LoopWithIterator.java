package lecture_classes.day47_collection_Part2;

import java.util.HashSet;
import java.util.*;

public class LoopWithIterator {
	
	public static void main(String[] args) {
		
		List<Integer> numSet = new ArrayList<>();
		numSet.add(50);
		numSet.add(45);
		numSet.add(1120);
		numSet.add(150);
		numSet.add(24);
		numSet.add(58);
		
		//create Iterator object
		Iterator<Integer> it = numSet.iterator();
		
		//call hasNext method
		//hasNext return true if there is still next value
		//returns false when it reaches the end or empty
		
		System.out.println("it.hasNext()" + it.hasNext());
		System.out.println("it.next()"+ it.next());
		System.out.println("it.next()"+ it.next());
		
		numSet.forEach(n-> System.out.print(n+" | "));
	
		while (it.hasNext()) {
			System.out.println(it.next());
			
		}
	
	//System.out.println("it.next()"+ it.next()); //?
	
		Iterator<Integer> it2 = numSet.iterator();
		
		//what is the difference between for each loop and iterator?
		//we remove objects while looping
		
		while(it2.hasNext()) {
			int val = it2.next();
			if (val>1000) {
				it2.remove();
			}
		}
	
		System.out.println(numSet.toString());
		
		
		List<String> cities = new ArrayList<>();
		cities.add("New York");
		cities.add("Boston");
		cities.add("Virginia");
		cities.add("DC");
		
		System.out.println(cities.toString());
		/*
		//we can not remove items with for eachloop
		for (String city : cities) {
			if (city.equals("Boston")) {
				cities.remove(city);
			}
		}
		
		Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.ArrayList$Itr.checkForComodification(ArrayList.java:1013)
	at java.base/java.util.ArrayList$Itr.next(ArrayList.java:967)
	at lecture_classes.day47_collection_Part2.LoopWithIterator.main(LoopWithIterator.java:59)
		
		
		*/
		
		for (int i = 0; i < cities.size(); i++) {
			if (cities.get(i).equals("Boston")) {
				cities.remove(cities.get(i));
			}
		}
		
		System.out.println(cities.toString());
		
		
	}

	
	
}
