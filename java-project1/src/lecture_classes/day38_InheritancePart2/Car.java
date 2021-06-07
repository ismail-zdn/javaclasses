package lecture_classes.day38_InheritancePart2;

public class Car extends Vehicle{

	int maxSpeed = 180;
	
	public void dsplay() {
		System.out.println("Maximum speed: "+super.maxSpeed); //come from parent class
		System.out.println("Maximum speed: "+maxSpeed);
	}
}
