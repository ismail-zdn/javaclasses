package lecture_classes.day34_constructors_passingObjecttoMethod;

public class Carpet {
	
	double cost;
	
	public Carpet(double c) {
		cost = c;
		
		if (cost < 0) {
			cost = 0;
		}
	}
	
	public double getCost() {
		return this.cost;
	}

}
