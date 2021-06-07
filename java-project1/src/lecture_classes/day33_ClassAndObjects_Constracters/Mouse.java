package lecture_classes.day33_ClassAndObjects_Constracters;

public class Mouse {
	
	int numTeeth;
	int numWhisers;
	int weight;
	
	public Mouse(int weight) {
		this(30,weight);
		this.weight = weight;
		
	}
	public Mouse(int numTeeth, int weight) {
		this(numTeeth,20,weight);
		this.numTeeth = numTeeth;
		this.weight = weight;
	}
	public Mouse(int numTeeth, int numWhisers, int weight) {
		
		this.numTeeth = numTeeth;
		this.numWhisers = numWhisers;
		this.weight = weight;
	}
	
	public void print() {
		System.out.println(weight +"-"+numTeeth+"-"+numWhisers );
	}
	

}
