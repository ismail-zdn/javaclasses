package lecture_classes.day47_collection_Part2;

import java.util.HashSet;
import java.util.List;
import java.util.*;

public class SetExample {

	public static void main(String[] args) {
		
		Set<Integer> mySet = new HashSet<>();
		
		mySet.add(100);
		mySet.add(200);
		mySet.add(800);
		mySet.add(1000);
		mySet.add(1000);
		mySet.add(900);
		
		System.out.println(mySet.toString());
		
		List<String> list = Arrays.asList("23","23","a","a","jj","t","t");
		
		Set<String> unique = new HashSet<>(list);
		System.out.println(list.toString());
		System.out.println(unique.toString());
		
		TreeSet<Integer> tSet = new TreeSet<>();
		tSet.add(500);
		tSet.add(45);
		tSet.add(354);
		tSet.add(367);
		tSet.add(2);
		tSet.add(2);
		tSet.add(7585);
		
		System.out.println(tSet.toString());
		
	}
}
