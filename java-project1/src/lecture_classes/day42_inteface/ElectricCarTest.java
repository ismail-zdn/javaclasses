package lecture_classes.day42_inteface;

public class ElectricCarTest {
	
	public static void main(String[] args) {
		
	//	ElectricCar ec = new ElectricCar();// abstract class can not be instantiated.
		
		Tesla modelS = new Tesla("Model S", 10000, "Gray");
		modelS.charge();
		modelS.start();
		modelS.drive();
		modelS.stop();
		
		System.out.println("########");
		
		Ford fusion = new Ford("Fusion", 5000, "Black", 2020);
		fusion.charge();
		fusion.start();
		fusion.drive();
		fusion.stop();
		
		System.out.println("########");
		
		TeslaSemi semi = new TeslaSemi("Semi", 5000, "White", 3.5);
		semi.charge();
		semi.start();
		semi.load("Oranges");
		semi.drive();
		semi.stop();
		
		System.out.println("########");
		
		TeslaTruck tr = new TeslaTruck("Cybertruck", 5564456, "Blue", 6.0);
		tr.charge();
		tr.start();
		tr.load("JAva BOOks");
		tr.drive();
		tr.stop();
		
		System.out.println("########");
		
		System.out.println(modelS.toString());
		System.out.println(fusion.toString());
		System.out.println(tr.toString());
		
	}

}
