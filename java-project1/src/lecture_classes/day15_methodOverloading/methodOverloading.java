package lecture_classes.day15_methodOverloading;

public class methodOverloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
	
	public static int sum(int num1,int num2) {
	
		return num1+num2;
	}
	public static int sum(int num1,int num2, int num3) {
		
		return num1+num2;
	}
	
	public static int sum(int num1,float isNumber) {
		
		return num1;
	}
	public static int sum(float isNumber,int num1) {
		
		return num1;
	}
//	public static float sum(int num1,int num2) {
//		
//		return num1+num2;
//	}

}
