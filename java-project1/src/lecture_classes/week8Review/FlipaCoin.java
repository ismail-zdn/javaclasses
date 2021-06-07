package lecture_classes.week8Review;

import java.util.Arrays;
import java.util.Random;

public class FlipaCoin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Arrays.toString(flipCoins(10)));

	}
	
	public static String[] flipCoins(int numOfFlips) {
		Random rn = new Random();
		String[] results = new String[numOfFlips];
		
		for (int i = 0; i < numOfFlips; i++) {
			int number = rn.nextInt(2);
			if (number == 0) {
				results[i] = "H";	
			}else {
				results[i] = "T";
			}
			
		}
		return results;
	}

}
