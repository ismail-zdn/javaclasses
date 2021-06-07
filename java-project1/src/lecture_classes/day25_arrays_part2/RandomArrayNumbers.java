package lecture_classes.day25_arrays_part2;

import java.util.Random;

public class RandomArrayNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Random rn = new Random();
		
		int[] numbers = {1,2,3,4,5,6,7,8,9,10};
		
		
		
		for (int i = 0; i < numbers.length; i++) {
			numbers[i] = rn.nextInt(100);
			System.out.println(numbers[i]);
		}
		

	}

}
