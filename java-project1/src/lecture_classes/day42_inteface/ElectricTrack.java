package lecture_classes.day42_inteface;

public abstract class ElectricTrack extends ElectricCar{
	
	public ElectricTrack(String model, double price, String color) {
		super(model, price, color);
	}


	public abstract void load(String item);

}
