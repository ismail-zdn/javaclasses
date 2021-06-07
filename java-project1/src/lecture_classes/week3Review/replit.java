package lecture_classes.week3Review;

import java.util.Scanner;

public class replit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		@SuppressWarnings("resource")
		Scanner scan = new Scanner(System.in);
	    int currentBalance;
	    String itemName;
	    System.out.println("item ");
	    
	    String item = scan.nextLine();
	    itemName = item;
	  //  System.out.println(item);
	    //WRITE YOUR CODE HERE
	    if(itemName == "Smartphone") {
	    	System.out.println(itemName);
	    }

	    if(itemName == "Smartphone" || itemName == "Laptop"){
	      item = scan.nextLine();
	      System.out.println(item);
	      System.out.println("Sorry, not enough funds on your gift card!");
	    }else if(item == "Charger"){
	      currentBalance=100-15;
	      System.out.println("Thank you for your purchase!");
	      System.out.println("Your current balance is: "+currentBalance+"$");
	    }else if(item == "USB Cable"){
	      currentBalance=100-10;
	      System.out.println("Thank you for your purchase!");
	      System.out.println("Your current balance is: "+currentBalance+"$");
	    }else if(item == "Headphones"){
	      currentBalance=100-30;
	      System.out.println("Thank you for your purchase!");
	      System.out.println("Your current balance is: "+currentBalance+"$");
	    }else if(item == "Pants"){
	      currentBalance=100-50;
	      System.out.println("Thank you for your purchase!");
	      System.out.println("Your current balance is: "+currentBalance+"$");
	    }else if(item == "Hat"){
	      currentBalance=100-25;
	      System.out.println("Thank you for your purchase!");
	      System.out.println("Your current balance is: "+currentBalance+"$");
	    }else if(item == "Socks"){
	      currentBalance=100-5;
	      System.out.println("Thank you for your purchase!");
	      System.out.println("Your current balance is: "+currentBalance+"$");
	    }else if(item == "Blanket"){
	      currentBalance=100-60;
	      System.out.println("Thank you for your purchase!");
	      System.out.println("Your current balance is: "+currentBalance+"$");
	    }else if(item == "Pillow"){
	      currentBalance=100-40;
	      System.out.println("Thank you for your purchase!");
	      System.out.println("Your current balance is: "+currentBalance+"$");
	    }else{
	      System.out.println("Invalid item!");
	    }

	}

}
