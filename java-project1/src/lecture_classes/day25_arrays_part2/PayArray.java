package lecture_classes.day25_arrays_part2;

import java.util.Scanner;

public class PayArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int employees = 5;
		double payRate;
		double grossPay;
		
		Scanner input = new Scanner(System.in);
		
		int[] hours = new int[employees];
		
		System.out.println("Enter the hpurs wprked by "+employees);
		
		for (int i = 0; i < employees; i++) {
			hours[i] = input.nextInt();
		}
		
		System.out.println("enter he hpurly rate for each employee:");
		
		payRate = input.nextDouble();
		
		for (int i = 0; i < employees; i++) {
			grossPay = hours[i]*payRate;
			
			System.out.println("employee #"+(i+1) + ": $" + grossPay);
		}
				

	}

}
