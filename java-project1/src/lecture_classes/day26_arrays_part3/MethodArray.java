package lecture_classes.day26_arrays_part3;

import java.util.Random;

public class MethodArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		printArray(createArray(8));
		
		System.out.println("----------------");
		
		candpArray(8);

	}
	
	public static int[] createArray(int arraySize){
		Random rn = new Random();
		int[] myArray = new int[arraySize];
		for (int i = 0; i < myArray.length; i++) {
			myArray[i]= rn.nextInt(100);
		}
		return myArray;
	}
	
	public static void printArray(int[] array) {
		for (int i : array) {
			System.out.println(i);
		}
	}
	
	public static void candpArray(int arraySize) {
		 for (int i : createArray(arraySize)) {
			System.out.println(i);
		}
	}

}
