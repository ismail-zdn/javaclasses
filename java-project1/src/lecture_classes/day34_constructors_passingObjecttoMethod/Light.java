package lecture_classes.day34_constructors_passingObjecttoMethod;

public class Light {
	
	int noOfWatts;
	boolean indicator;
	String location;
	
	public Light() {
		this(0,false); // chaining cons. 2
		System.out.println("Returning from no-argument contructor no.1");
	}

	public Light(int noOfWatts, boolean indicator) {
		this(noOfWatts,indicator,"X");
		System.out.println("Returning from contructor no.2");
	}

	public Light(int noOfWatts, boolean indicator, String location) {
		System.out.println("Returning from contructor no.3");
		this.noOfWatts = noOfWatts;
		this.indicator = indicator;
		this.location = location;
	}
	
	

}
