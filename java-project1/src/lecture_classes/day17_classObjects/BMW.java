package lecture_classes.day17_classObjects;

public class BMW {
	
	String make="BMW",model;
	double price;
	
	public void showPrice() {
		
		switch(model) {
		
		case "330i":
			price=40250;
			break;
		case "740i":
			price=85000;
			break;
		case "m3":
			price=65000;
			break;
		default :
			price=0;
			System.out.println(model+ " is not available.");
		
		}
		System.out.println("Price: "+price);
	}

}
