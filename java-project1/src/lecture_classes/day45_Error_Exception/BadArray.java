package lecture_classes.day45_Error_Exception;

public class BadArray {
	
	public static void main(String[] args) {
		
		int[] number = {1,2,3};
		
		for (int i = 0; i <= number.length; i++) {
			System.out.println(number[i]);
		}
		
		System.out.println("Learning Exception.");
		
	}

}
