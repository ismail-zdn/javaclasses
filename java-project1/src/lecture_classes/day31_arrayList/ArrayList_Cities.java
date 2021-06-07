package lecture_classes.day31_arrayList;

import java.util.ArrayList;

public class ArrayList_Cities {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> cities = new ArrayList<>();
		
		cities.add("Istanbul");
		cities.add("Stuttgart");
		cities.add("Berlin");
		cities.add("Ankara");
		
		System.out.println(cities.toString());
		
		// print elements of ArrayList
		
		// 1- method
		
		for (String city : cities) {
			System.out.print(city+" ");
		}
		
		System.out.println();
		// 2 - method
		
		for (int i = 0; i < cities.size(); i++) {
			System.out.print(cities.get(i)+" ");
		}
		
		System.out.println();
		// remove Ankara // ilk Ankara silinir.
		
		cities.remove("Ankara");
		System.out.println(cities.toString());
		
		cities.add(1,"Antalya");
		System.out.println(cities.toString());
		
		int idx = cities.indexOf("Istanbul");
		System.out.println(idx);
		
		// element yoksa -1 cevirir.
		System.out.println(cities.indexOf("Bursa"));
		
		boolean empty = cities.isEmpty();
		System.out.println(empty); //false
		
		cities.clear();
		System.out.println(cities.isEmpty()); //true
		
		
		
		
		
		
	}

}
