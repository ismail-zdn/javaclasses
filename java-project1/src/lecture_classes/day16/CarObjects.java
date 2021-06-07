package lecture_classes.day16;

public class CarObjects {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		car car1 = new car();
		car1.make="Mercedes";
		car1.model="AMG";
		car1.currentSpeed=100;
		
		car1.printCarInfo();
		car1.showCurrentSpeed(70);
		car1.drive();
		car1.accelerate(99);

	}

}
