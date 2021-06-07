package lecture_classes.day36_staticClassMembers;

public class CalculatorTest {
	
	
	public static void main(String[] args) {

		double result = Calculator.plus(50, 90);
		System.out.println(result);
		
		Calculator c = new Calculator();
		System.out.println(c.multiply(12, 12));
		
		CalculatorTest c1 = new CalculatorTest();
		
		c1.m1(); // you can use like this too.
		
		
		
	}
	
	public static void m1() { // it is a static method too
		System.out.println("HEllo!");
	}
	

	

}
