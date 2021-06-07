package lecture_classes.day46_collection_Part1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingArrayList{
	
	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("hebele");
		list.add("hübele");
		list.add("cumbala");
		
		System.out.println("before sorting");
		System.out.println(list.toString());
		
		System.out.println("after sorting");
		
		Collections.sort(list);
		
		System.out.println(list.toString());
		
		List<Product> productList = new ArrayList<>();
		productList.add(new Product("Spoon", 13.99));
		productList.add(new Product("bag", 100.00));
		productList.add(new Product("shoes", 40.00));
		productList.add(new Product("computer", 1000.00));
		
		System.out.println("before sorting");
		System.out.println(productList.toString());
		
		Collections.sort(productList);
		
		System.out.println("after sorting");		
		System.out.println(productList.toString());
		
		Product p1 = new Product("spoon", 25.88);
		Product p2 = new Product("löfel", 10.88);
		Product p3 = new Product("TELLER", 2.88);
		
		System.out.println(p1.compareTo(p2));
	}

}

