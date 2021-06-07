package lecture_classes.day48_collection_Part3;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import lecture_classes.day46_collection_Part1.Product; //because it is in the different package

public class HashSetOfProducts {
	
	public static void main(String[] args) {
		
		//create set collection 
		Set<Product> prodSet = new TreeSet<>(); 
		
		prodSet.add(new Product("book", 25.99));
		prodSet.add(new Product("book", 17.99));
		prodSet.add(new Product("magazine", 7.99));
		
		System.out.println(prodSet.toString());
		
		prodSet.forEach(p-> System.out.print(p+" | "));
		
		System.out.println();
		
		prodSet.forEach(p-> System.out.print(p.getName()+" | "));
		
		System.out.println();
		
		for (Product product : prodSet) {
			System.out.print(product.getPrice() + " | ");
		}
		
		
	}

}
