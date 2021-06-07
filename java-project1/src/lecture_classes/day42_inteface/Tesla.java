package lecture_classes.day42_inteface;

public class Tesla extends ElectricCar {

	public Tesla(String model, double price, String color) {
		super(model, price, color);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void start() {
		System.out.println("Tesla is starting quitely...");
		System.out.println("Change to Drive Mode");
		
	}

	@Override
	public void charge() {
		System.out.println("Tesla is charging. Plugin to Electric outlet");
		
	}

	@Override
	public void drive() {
		System.out.println("Tesla is driving.");
		
	}

}
