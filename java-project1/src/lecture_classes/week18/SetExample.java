package lecture_classes.week18;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> set1 = new HashSet<>();
		set1.add("d");
		set1.add("z");
		set1.add("a");
		set1.add(null);
		set1.add("2");
		set1.add("k");
		set1.add("k"); // it is not allowed duplicate element
		System.out.println(set1); // Hashset doesnt care where the element ist.
		
		Set<String> set2 = new LinkedHashSet<>();
		set2.add("d");
		set2.add("z");
		set2.add("a");
		set2.add(null);
		set2.add("2");
		set2.add("k");
		set2.add("k"); // it is not allowed duplicate element
		System.out.println(set2); // LinkedHashSet care where the element ist.
		
		Set<String> set3 = new TreeSet<>();
		set3.add("d");
		set3.add("z");
		set3.add("a");
		//set3.add(null); //Doesn't allow the null element
		set3.add("k");
		set3.add("k"); // it is not allowed duplicate element
		System.out.println(set3); // The natural order is used to store the elements. 
		
		
	}
}
