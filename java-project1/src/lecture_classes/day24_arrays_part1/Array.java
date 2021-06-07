package lecture_classes.day24_arrays_part1;

public class Array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sum = 0;
		int[] myList = {999,2,3,4,5};
		
		System.out.println(myList[0]);
		
		String[] myString = {"hello","world"};
		
		System.out.println(myString.length);
		
		System.out.println(myList.length);
		
		for (int i = 0; i < myList.length; i++) {
			
			sum = sum + myList[i];
			
			
			
			System.out.print(myList[i] + "-");
			
		}
		System.out.println("\nThe sum is: "+sum);
		System.out.println("The avarage is: "+(sum/myList.length));
		}

}
