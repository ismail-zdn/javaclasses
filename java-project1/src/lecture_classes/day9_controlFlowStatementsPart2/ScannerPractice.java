package lecture_classes.day9_controlFlowStatementsPart2;
import java.util.Scanner;
public class ScannerPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		@SuppressWarnings("resource")
		Scanner inputName = new Scanner(System.in);
		
		System.out.println("Wie heißen Sie ?");
		
		String Name = inputName.next();
		
		System.out.println("Ihre Name ist " + Name		);
		System.out.println("Wie alt sind Sie ? ");
		
		int Age = inputName.nextInt();
		
		System.out.println("Sie sind "+ Age + " Jahre alt.");
		
		/*
		Day 5 : Notes 

Scanner is class that comes from JDK library
We can use it to capture keyboard input from users

In order to use Scanner we need to first import it as below

Import java.util.Scanner ;

The import statement must be in between your package declaration and before the beginning of the class 

package day05

import java.util.Scanner;

public class  Example {

}

// Create scanner object

Scanner scan = new Scanner(System.in);

There is few ways to get users input and store the result

Getting single word as String   —> scan.next() ;

Getting single number as int    —> scan.nextInt() ;

Getting single fractional number as double    —> scan.nextDouble() ;

Getting single fractional number as float    —> scan.nextFloat() ;

Getting single true or false as boolean    —> scan.nextBoolean() ;

System.out.println("What is your name : ");

//String name = "Sam" ;

String name = scan.next();

System.out.println("My name is  " + name );

		 */
		
		

	}

}
