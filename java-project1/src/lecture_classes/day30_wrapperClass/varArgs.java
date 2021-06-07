package lecture_classes.day30_wrapperClass;

public class varArgs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		sum(2,4);
		sum(5,6,9);
		sum(58,99,4,66,3,4);
		
		// ... convert arguments an array
		

	}
	
	public static void sum(int... numbers) {    //A vararg parameter can take a variable number of argument.
		int sum =0;
		
		for (int value : numbers) {
			sum = sum+value;
		}
		
		System.out.println(sum);
	}

}
