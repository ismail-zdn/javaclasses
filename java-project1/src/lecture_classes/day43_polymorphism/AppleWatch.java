package lecture_classes.day43_polymorphism;

public class AppleWatch extends AppleDevice{

	@Override
	public void use() {
		System.out.println("AppleWatch | Sport");
		
	}
	
	public void wear() {
		System.out.println("Wearing AppleWatch");
	}

}
