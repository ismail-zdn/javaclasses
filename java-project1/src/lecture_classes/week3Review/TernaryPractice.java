package lecture_classes.week3Review;

import java.util.Scanner;

public class TernaryPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int uhr = 12;
		
		String amORpm = (uhr >12 ? "PM" : "AM");
		
		System.out.println("Es ist "+uhr+" "+ amORpm);
		
		
		/////////
		
		int num1, num2=0;
							
		Scanner input = new Scanner(System.in);
		
		System.out.println("ilk sayiyi giriniz:");
		
		num1 = input.nextInt();
		
		System.out.println("ikinci sayiyi giriniz:");
		
		num2 = input.nextInt();
			
		int biggerNumber = 0;
		
		biggerNumber = (num1!=num2 ? num1>num2 ? num1 : num2 : 0);
		
		System.out.println(biggerNumber==0 ? "These numbers are equal." : biggerNumber+ " is biggest one." );

	}

}
