package lecture_classes.day39_Inheritance_Review;

public class Car extends Vehicle{

	private int wheels;
	private int doors;
	private int gears;
	private boolean isManual;
	private int currentGear;
	public Car(String name, String size,int wheels, int doors, int gears,
			boolean isManual) {
		this.wheels = wheels;
		this.doors = doors;
		this.gears = gears;
		this.isManual = isManual;
		this.currentGear = 1;
	}
	
	public void changeGear(int currentGear) {
		this.currentGear= currentGear;
	}
	
	public void changeVelocity(int speed,int direction) {
		System.out.println("Car.changeVelocity()");
		super.move(speed,direction); //parent classes method
		//this.move(speed,direction); //sub classes method
	}

	@Override
	public void move(int velocity, int direction) {
		setCurrentDirection(direction+10);
		setCurrentVelocity(velocity+10);
		System.out.println("Vehicle.move() -Override-");
	}
	
	
	

	
	
}
