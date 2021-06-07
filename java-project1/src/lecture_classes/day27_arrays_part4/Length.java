package lecture_classes.day27_arrays_part4;

public class Length {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] numbers = {
				{1,4,3,6,99},
				{45,99,45},
				{654,967,564,413,99,3}
				};
		
		System.out.println("Number of array of numbersArray: "+numbers.length);
		
		System.out.println("Number of elements of numbers's first array: " + numbers[0].length);
		System.out.println("Number of elements of numbers's second array: " + numbers[1].length);
		System.out.println("Number of elements of numbers's third array: " + numbers[2].length);
		
		for (int i = 0; i < numbers.length; i++) {
			System.out.println(i+". array element's number: "+numbers[i].length);
		}
		
		System.out.println("--------");
		
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {
				System.out.println(numbers[i][j]);
			}
			
			System.out.println("------------");
		}
	}

}
