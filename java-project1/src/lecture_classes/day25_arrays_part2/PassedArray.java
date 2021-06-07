package lecture_classes.day25_arrays_part2;

import java.util.Scanner;

public class PassedArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = new int[4];
		
		getValues(numbers);
		showArray(numbers);
		

	}
	
	public static void getValues(int[] array) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("please enter "+ array.length+" number:");
		
		for (int i = 0; i < array.length; i++) {
			System.out.println("Enter number "+(i+1)+" :");
			array[i] = input.nextInt();
		}
	}
	
	public static void showArray(int[] array) {
		for (int i : array) {
			System.out.println(i);
		}
	}

}
