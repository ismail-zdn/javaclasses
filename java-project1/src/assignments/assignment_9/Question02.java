package assignments.assignment_9;

import java.util.Scanner;

public class Question02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * Question-2

Write a program that will calculate laptop price based on the components.

First, ask user for screen size. If screen size equals to 13.3, add $200 to the laptop price. 
If screen size equals to 15.0 - add $300 to the laptop price. If screen size equals to 17.3 - add $400 to the laptop price.

Then ask the user for CPU type. If CPU type equals to i3, add $150 to the laptop price.
 If CPU type equals to i5, add $250 to the laptop price. If CPU type equals to i7, add $350 to the laptop price.

Then ask the user for RAM size. Add $50 for every 4GB of ram to the laptop price.

Then, ask the user for the storage type. There are 2 options: SSD and HDD. 
If it's HDD - add $50 to the laptop price for every 500gb. If it's SSD - add $100 to the laptop price for every 500GB.

Then ask the user for screen resolution. 
There are 2 options: FULLHD and 4K. Add $100 if it's FULLHD screen and $200 if it's 4K screen.

Sample Output:

Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i7
Display message: Select RAM size:
input: 8
Display message: Select storage type:
input: SSD
Display message: Enter memory size:
input: 1000
Display message: Enter screen resolution:
input: 4K
Display message: Laptop price is: $1050.0
Example #2

Display message: Select screen size:
input: 13.3
Display message: Select CPU type:
input: i3
Display message: Select RAM size:
input: 4
Display message: Select storage type:
input: HDD
Display message: Enter memory size:
input: 500
Display message: Enter screen resolution:
input: FULLHD
Display message: Laptop price is: $550.0*/
		
		Scanner input = new Scanner(System.in);
		System.out.println("Select screen size:");
		double screenSize = input.nextDouble();
		System.out.println("Select CPU type:");
		String cpuType = input.next();
		System.out.println("Select RAM size:");
		int ramSize = input.nextInt();
		System.out.println("Select storage type:");
		String storageType = input.next();
		System.out.println("Enter memory size:");
		int memorySize = input.nextInt();
		System.out.println("Enter screen resolution:");
		String screenRes = input.next();
		
		calcLaptopPrice(screenSize, cpuType, ramSize, storageType, memorySize, screenRes);
		

	}
	
	public static void calcLaptopPrice(double screenSize, String cpuType , int ramSize ,String storageType , int memorySize ,String screenRes) {
		double price = 0;
		if (screenSize == 13.3) {price += 200;}
		else if(screenSize == 15.0) {price += 300;}
		else if(screenSize == 17.3) {price += 400;}
		
		switch(cpuType) {
		case "i3" : price += 150; break;
		case "i5" : price += 250; break;
		case "i7" : price += 350; break;
		}
		
		price += (ramSize/4)*50;
		
		switch(storageType) {
		case "SSD" : price += (memorySize/500)*100; break;
		case "HDD" : price += (memorySize/500)*50; break;
		}
		
		switch(screenRes) {
		case "4K" : price += 200; break;
		case "FULLHD" : price += 100; break;
		}
		
		System.out.println("Laptop price is: $"+price);
		
	}

}
