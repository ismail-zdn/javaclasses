package lecture_classes.day15_methodOverloading;

public class task71 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		calcFeetandInchesToCentimeters(100);

	}
	
	public static double calcFeetandInchesToCentimeters(double feet, double inches) {
		if (feet<0 || (inches <0 || inches>12)) {
			System.out.println("Invalid feed or inches value");
			return -1;
		}
		
		double centimeters = (feet*12)*2.54 + (inches*2.54);
		
		System.out.println(feet + " feet, " + inches + " inches " + centimeters + " centimeters.");
		
		return centimeters;
	}
	
	public static double calcFeetandInchesToCentimeters(double inches) {
		
		if (inches<0) {
			return -1;
		}
		
		double feet = (int)inches /12;
		
		double remainingInches = inches%12;
		
		System.out.println(inches + " inches= " + feet + " feet and "+ remainingInches + " inches");
		
		return calcFeetandInchesToCentimeters(feet, remainingInches);
	}

}
