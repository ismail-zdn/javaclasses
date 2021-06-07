package lecture_classes.day34_constructors_passingObjecttoMethod;

public class TestCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Floor floor = new Floor(10,8);
		Carpet carpet = new Carpet(20);
		
		Calculator calc = new Calculator(floor, carpet);
		System.out.println(calc.getTotalCost());

	}

}
