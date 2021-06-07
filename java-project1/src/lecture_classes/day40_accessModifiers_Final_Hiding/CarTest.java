package lecture_classes.day40_accessModifiers_Final_Hiding;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c = new Car();
		c.model="M3"; //default
		c.year=2018; // public
		//c.door=4; weil private ist.
		c.engine=2.0;

	}

}
