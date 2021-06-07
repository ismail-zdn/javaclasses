package lecture_classes.day33_ClassAndObjects_Constracters;

public class Car {
	
	String model;
	String make;
	int year ;
	double mile ;
	String color;
	
	public Car() {
		model = "Honda";
		make = "Civic";
	}
	
	public Car(String mo, String ma , int yr , double ml , String cl) {
		model = mo;
		make = ma;
		year = yr;
		mile = ml;
		color = cl;
	}

	/**
	 * @param model
	 * @param make
	 * @param year
	 */
	public Car(String model, String make, int year) {
		super();
		this.model = model;
		this.make = make;
		this.year = year;
	}


}
