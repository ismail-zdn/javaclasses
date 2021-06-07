package lecture_classes.day38_InheritancePart2;

public class Contructor extends Employee{

	@Override
	public void calculatePay(int hours, double rate) {

		System.out.println("Contructor Employee total pay: "+ ((hours*rate)+200));
		
	}
	
	

}
