package lecture_classes.day40_accessModifiers_Final_Hiding;

public class MethodHidingTest {

}


class Bear{
	public static void eat() {
		System.out.println("Bear is eating.");
	}
	
	public static void sneeze() {
		System.out.println("Bear is sneezing.");
	}
	
	public void hibernate() {
		System.out.println("Bear is hibernating.");
	}
}

class Panda extends Bear{
	
	//method hiding
	public static void eat() {
		System.out.println("Panda is eating.");
	}
	// it should be static too. Or both of them should be instance
	/*
	public void sneeze() {
		System.out.println("Panda is sneezing.");
	}
	*/
	
	@Override
	public void hibernate() {
		System.out.println("Panda is hibernating.");
	}
	
}