package lecture_classes.week17;

public class Manager {

	
	public static void main(String[] args) {
		
		Tecnischen hatef = new Tecnischen("Hatef");
		// create several Car instances
		Car yaris = new Toyota();
		Car focus = new Ford();
		Car azera = new Hyundai();
		Renault megane = new Renault();
		// create manager object
		Manager manager = new Manager();
		// now manager calls the technician to start repairing
		hatef.repair(yaris); // hatef is able to repair any Car instances
		hatef.repair(focus); // focus is a Car instance
		hatef.repair(azera); // azera is a Car instance
		// now, watch below code, it is wrong because of polymorphism violation. megane is not an object of Car class.
		hatef.repair(megane);
		
		
		System.out.println(yaris.getName());
//		yaris.repair();
//		focus.repair();
//		azera.repair();
//		megane.repair();
		
	}
	
}
