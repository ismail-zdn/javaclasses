package lecture_classes.day35_encapsulation;

import java.util.Scanner;

public class RoulettePocketTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter your pocket number: ");
		
		RoulettePocket r1 = new RoulettePocket(input.nextInt());
		
		while(r1.getPocketColor().equalsIgnoreCase("invalid")) {
			System.out.println("Enter your pocket number: ");
			r1.setPocketNumber(input.nextInt());
		}

		input.close();
		System.out.println(r1.getPocketColor());
		
	}

}
