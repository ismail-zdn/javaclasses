package lecture_classes.day26_arrays_part3;

import java.util.Scanner;

public class EthodArrays2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// createArray with one parameter arraySize
		// user will enter some cars
		
		//findcar method accept 2 paremeters int value toFindCar
		//if car is found - return true
		// if not return false
		
		System.out.println(findCar(2, "Honda"));
		
		

	}
	
	public static String[] createArray(int arraySize) {
		
		Scanner input = new Scanner(System.in);
		
		String[] carArray = new String[arraySize];
		
		for (int i = 0; i < carArray.length; i++) {
			System.out.print("enter your car #" + i + " :");
			carArray[i] = input.next();
		}
		return carArray;
	}
	
	public static boolean findCar(int arraySize, String toFindCar ) {
		
		for (String car : createArray(arraySize)) {
			
			if (car.equalsIgnoreCase(toFindCar)) {
				return true;
			}
			
		}
		
		return false;
		
	}
	

}
