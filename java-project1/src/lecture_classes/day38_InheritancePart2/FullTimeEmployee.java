package lecture_classes.day38_InheritancePart2;

public class FullTimeEmployee extends Employee{

	@Override
	public void calculatePay(int hours, double rate) {
		System.out.println("Fulltime Employee total pay: "+ (hours*rate*1.2));
	}
	
}
