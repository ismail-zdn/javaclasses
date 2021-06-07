package lecture_classes.week8Review;
import java.util.*;
public class randomArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(Arrays.toString(generateRandimArray(10)));
		

	}
	
	public static int[] generateRandimArray(int size) {
		
		Random rn = new Random();
		
		int[] arr = new int[size];
		
		for (int i = 0; i < size; i++) {
 
			arr[i] = rn.nextInt(100)+1;
			
		}
		return arr;
	}
	
	

}
