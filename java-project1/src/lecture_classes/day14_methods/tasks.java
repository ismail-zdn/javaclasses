package lecture_classes.day14_methods;

public class tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(LastDigit(7,17));
		System.out.println(LastDigit(6,17));
		System.out.println(LastDigit(3,113));
		
		

	}
	
	public static boolean LastDigit(int num1 , int num2) {
		
		boolean result;
		
		if (num1%10 == num2%10) {
			result = true;
		}else {
			result = false;
		}
		
		return result;
	}

}
