package lecture_classes.day41_Abstraction;

public abstract class Bird extends Animal{

	// if a abstract class extending another class it is optional to implement abstract methods
	
	
	@Override
	public void eat() {
		System.out.println("Bird is eating.");
		
	}

	public abstract void fly();
	
//	@Override
//	public void breathe() {
//		System.out.println("Bird is breathing.");
//		
//	}

	
	
}
