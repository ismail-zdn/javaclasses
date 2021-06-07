package lecture_classes.day41_Abstraction;

public class Dog extends Animal{

	@Override
	public void eat() {
		System.out.println("Dog is eating.");
		
	}

	@Override
	public void breathe() {
		System.out.println("Dog is breating.");
		
	}

	@Override // you don't have to implement instance method
	public void move() {
		// TODO Auto-generated method stub
		super.move();
	}

	
}
