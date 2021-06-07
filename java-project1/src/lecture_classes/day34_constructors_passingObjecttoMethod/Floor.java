package lecture_classes.day34_constructors_passingObjecttoMethod;

public class Floor {
	
	double width;
	double length;
	
	public Floor(double w , double l) {
		width = w;
		length = l;
		if (width < 0) {
			width = 0;
		}
		if(length < 0 ) {
			length = 0;
		}
	}
	
	public double getArea() {
		return (this.width * this.length);
	}

}
