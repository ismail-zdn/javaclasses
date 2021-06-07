package lecture_classes.day41_Abstraction;

public abstract class Animal { // abstract class
	
	public abstract void eat(); //Abstract method
	
	public abstract void breathe();
	
	public void move() { //instance method
		System.out.println("Moving");
	}

}
