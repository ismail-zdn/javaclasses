package lecture_classes.day31_arrayList;

import java.util.ArrayList;

public class ArrayListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> languages = new ArrayList<>();
		
		languages.add("Java");
		languages.add("English");
		languages.add("German");
		
		System.out.println("Languages count: "+languages.size());
		System.out.println(languages.toString());
		
		languages.add("Turkish");
		System.out.println(languages.toString());
		
		languages.remove(3);
		System.out.println("Languages count: "+languages.size());
		System.out.println(languages.toString());

	}

}
