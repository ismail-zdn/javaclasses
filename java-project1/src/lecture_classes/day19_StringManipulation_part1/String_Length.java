package lecture_classes.day19_StringManipulation_part1;

import java.util.Scanner;

public class String_Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Java";
		
		System.out.println(str.length());
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Please enter your first name: ");
		
		String firstname = input.next();
		
		System.out.println("Please enter your last name: ");

		String lastname = input.next();
		
		System.out.println(firstname.length()+lastname.length());
		
		
		

	}

}
