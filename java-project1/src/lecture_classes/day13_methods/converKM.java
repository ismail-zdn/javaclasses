package lecture_classes.day13_methods;

public class converKM {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		convertKM();
		sumOfNumbers();
		compareNumbers();
		payCalc(48, 50);
		mathCalc(20, 40, "*");

	}
	
	public static void convertKM() {
		double km,mil=80;
		km = mil*1.609;
		System.out.println(km);
		
	}
	
	public static void sumOfNumbers() {
		
		int num1=9,num2=19,num3=87;
		System.out.println(num1+num2+num3);
	}
	
	public static void compareNumbers() {
		
		int num1=99,num2=12;
		
		if(num1>num2) {
			System.out.println("num1 is greater than num2");
		}else {
			System.out.println("num2 is greater than num1");
		}
			
	}
	
	public static void payCalc(double hours,double hourlyPay) {
		
		double pay = hours*hourlyPay;
		
		System.out.println(pay);
	}



	public static void mathCalc(int num1,int num2, String operator) {
		
		System.out.println(operator);
		System.out.println(num1+num2);
		
	}
	

}
