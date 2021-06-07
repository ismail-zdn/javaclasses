package lecture_classes.day15_methodOverloading;

import lecture_classes.day14_methods.task68;

public class fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1 =0;
		int num2 = 1;
		
		int count = 18;
		System.out.println(count+" number of Fibonacci :");
		
		for(int i = 1 ; i<count ; i++) {
			
			
			System.out.print(num1 + " ");
			
			int sumNumber = num1+num2;
			num1 = num2;
			num2 = sumNumber;
			
			
		}
		task68.yearsUntilRetirement("ismail", 1994);
	}

}
