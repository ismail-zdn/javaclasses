package assignments.Grocery_List;

import java.util.*;

public class Grocery_List {

	public static void main(String[] args) {
		
	ArrayList<String> groceryList = new ArrayList<>();
	printChoiceOptions();
	iteratedMethods(groceryList);	
	}
	
	public static void printChoiceOptions() {
		System.out.println(
				"Press"
			+	"\n0 - To print choice options."
			+ 	"\n1 - To print the list of grocery items."
			+ 	"\n2 - To add an item to the list."
			+ 	"\n3 - To modify an item in the list."
			+ 	"\n4 - To remove an item from the list."
			+ 	"\n5 - To search an item from the list."
			+ 	"\n6 - To quit the application.");
		
	}
	
	public static void runTheChoice(ArrayList<String> groceryList,int choice) {
		
		switch(choice) {
		case 0 :
			printChoiceOptions();
			iteratedMethods(groceryList);
			break;
		case 1 :
			printGroceryItems(groceryList);
			iteratedMethods(groceryList);
			break;
		case 2 :
			addAnItem(groceryList);
			iteratedMethods(groceryList);
			break;
			case 3 :
			modifyAnItem(groceryList);
			iteratedMethods(groceryList);
			break;
		case 4 :
			removeAnItem(groceryList);
			iteratedMethods(groceryList);
			break;
		case 5 :
			searchAnItem(groceryList);
			iteratedMethods(groceryList);
			break;
		case 6 :
			quitTheApp();
			break;
		default :
			System.out.println("Invalid choice!");
			printChoiceOptions();
			iteratedMethods(groceryList);
		}
	}
	
	public static void quitTheApp() {
			System.out.println("Good Bye");
			System.exit(0);
	}

	public static void searchAnItem(ArrayList<String> groceryList) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter item to search for:");
			String item = input.next();
			if (groceryList.indexOf(item) != -1) {
				System.out.println("Grocery item "+item+" has been found.");
			}else {
				System.out.println("Grocery item "+item+" has not been found.");
			}
	}

	public static void removeAnItem(ArrayList<String> groceryList) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter item number: ");
			int itemId = input.nextInt()-1;
			if (itemId < 0 || itemId > groceryList.size()-1) {
				System.out.println("You entered invalid item number. Please,");
				removeAnItem(groceryList);
			}
			groceryList.remove(itemId);
			System.out.println("Grocery item "+(itemId+1)+" has been removed.");
		
		
	}

	public static void modifyAnItem(ArrayList<String> groceryList) {
			Scanner input = new Scanner(System.in);
			System.out.print("Enter item number: ");
			int itemId = input.nextInt()-1;
			if (itemId < 0 || itemId > groceryList.size()-1) {
				System.out.println("You entered invalid item number. Please,");
				modifyAnItem(groceryList);
			}
			System.out.print("Enter replacement item: ");
			String replacementItem = input.next();
			groceryList.set(itemId, replacementItem);
			System.out.println("Grocery item "+(itemId+1)+" has been modified.");
	}

	public static void addAnItem(ArrayList<String> groceryList) {
			Scanner input = new Scanner(System.in);
			System.out.println("Please enter the grocery item:");
			groceryList.add(input.next());	
	}

	public static void printGroceryItems( ArrayList<String> groceryList) {

		
		if(groceryList.size()==0) {
			System.out.println("You have "+groceryList.size()+" items in your grocery list.");
		}else {
			System.out.println("You have "+groceryList.size()+" items in your grocery list.");
			for (int i = 0; i < groceryList.size(); i++) {
				System.out.println((i+1)+". "+groceryList.get(i));
			}
		}
	}

	public static void printEnterYourChoice() {
		System.out.print("Enter your choice: ");
	}
	
	public static int enterYourChoice() {
		Scanner input = new Scanner(System.in);
		return input.nextInt();
		
	}
	
	public static void iteratedMethods(ArrayList<String> groceryList) {
		printEnterYourChoice();
		runTheChoice(groceryList, enterYourChoice());
	}
}
