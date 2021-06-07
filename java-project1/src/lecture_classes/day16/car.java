package lecture_classes.day16;

public class car {
	
	String make, model, color;
	int currentSpeed;
	
	public void printCarInfo(){
		String info = "Car make is"+make+" Car model is "+model+" Cars color is "+color+" Car currentspeed is "+currentSpeed;
		
		System.out.println(info);
	
	}
	
	public void drive() {
	
		System.out.println(make+" "+model+" is driving.");
		
	}
	
	public void accelerate(int mph) {
		currentSpeed = currentSpeed+mph;
	}
	
	public void showCurrentSpeed(int speedLimit) {
		if (currentSpeed<=100) {
			System.out.println("good job");
		}else {
			System.out.println("bad job");
		}
	}

}
