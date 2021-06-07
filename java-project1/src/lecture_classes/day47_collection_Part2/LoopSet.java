package lecture_classes.day47_collection_Part2;

import java.util.ArrayList;
import java.util.*;

public class LoopSet {
	
	public static void main(String[] args) {
	
		Set<Integer> numSet = new HashSet<>();
		numSet.add(50);
		numSet.add(45);
		numSet.add(1120);
		numSet.add(150);
		numSet.add(24);
		numSet.add(58);
		
		for (Integer n : numSet) {
			System.out.print(n+" | ");
		}
		
		System.out.println();
		
		numSet.forEach(n-> System.out.print(n+" | "));
	
		
	
}
}
