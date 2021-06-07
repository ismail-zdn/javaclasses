package lecture_classes.day34_constructors_passingObjecttoMethod;

public class Calculator {
	
	Floor floor = new Floor(1,8);
	Carpet carpet = new Carpet(20);
	
	public Calculator(Floor floorP , Carpet carpetP) {
		floor = floorP;
		carpet = carpetP;
	}
	
	public double getTotalCost() {
		return floor.getArea() * carpet.getCost();
	}

}
