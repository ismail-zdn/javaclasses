package lecture_classes.day31_arrayList;

import java.util.ArrayList;

public class ArrayList_ShoppingList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> shoppingList = new ArrayList<>();
		
		shoppingList.add("paper towel");
		shoppingList.add("trash bag");
		shoppingList.add("clorox");
		shoppingList.add("gloves");
		shoppingList.add("shovel");
		
		// print number of items
		
		System.out.println(shoppingList.size());
		
		// print all items in single line
		
		System.out.println(shoppingList.toString());
		
		for (String item : shoppingList) {
			System.out.print(item+" ");
		}
		
		System.out.println();
		// print first and last item
		
		System.out.println(shoppingList.get(0)+"-"+shoppingList.get(shoppingList.size()-1));

		// remove sth
		
		shoppingList.remove("paper towel");
		System.out.println(shoppingList.toString());
		
		shoppingList.remove(0);
		System.out.println(shoppingList.toString());
		
		System.out.println(shoppingList);
		
	}

}
