package lecture_classes.day33_ClassAndObjects_Constracters;

public class CarTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car c1 = new Car();
		Car c2 = new Car("Honda","Civiv",2020,4999,"White");
		
		// contructor with no parameter --> default parameter
		
		System.out.println(c1.model);
		
		System.out.println(c2.color);
		
		Car cShortCut = new Car("Mercedes", "AMD", 2018);
		System.out.println(cShortCut.model);

	}

}
