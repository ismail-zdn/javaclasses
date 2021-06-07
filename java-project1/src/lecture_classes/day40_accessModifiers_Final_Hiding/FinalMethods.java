package lecture_classes.day40_accessModifiers_Final_Hiding;

public class FinalMethods {
	
	public final void method1() {
System.out.println("METHOD1");
}
	public static final void staticMethod(String word) {
		System.out.println("Static Method");
	}
}

class Sub extends FinalMethods{
	
	//@Override
	//The final local variable COLORS cannot be assigned.
	/*
	public void method1() {
		System.out.println("Method 1 in sub class");
	}
	*/
	
	
	//Cannot override the final method from FinalMethods
	/*
	public static void staticMethod(String word) {
		System.out.println("Static method in sub class");
	}
	
	*/
	
	
}