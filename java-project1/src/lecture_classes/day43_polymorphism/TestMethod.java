package lecture_classes.day43_polymorphism;

public class TestMethod {

	public static void main(String[] args) {
		

		childA chA = new childA();
		chA.m1(); //inheritance
		chA.m2(); //interface - override
		chA.m3(); //object
		
		childB chB = new childB();
		chB.m1();
		chB.m2();
		chB.m4();
		
		Parent p1 = new childA();
		p1.m1(); // Only method which is override
		
		Parent p2 = new childB();
		p2.m1(); // Only method which is override
		
		MyInterface int1 = new childA();
		int1.m2(); // Only method which is override
		
		MyInterface int2 = new childB();
		int2.m2(); // Only method which is override
	}

}

class Parent{
	public void m1() {
		
	}
}

interface MyInterface{
	void m2();
}

class childA extends Parent implements MyInterface{
	public void m2() {
		
	}
	public void m3() {
		
	}
}

class childB extends Parent implements MyInterface{
	public void m2() {
		
	}
	public void m4() {
		
	}
}