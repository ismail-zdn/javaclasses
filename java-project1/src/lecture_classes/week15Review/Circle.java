package lecture_classes.week15Review;

import java.text.DecimalFormat;

public class Circle extends Shape {

	double radius;
	
	static {name="Circle";}
	
	public Circle(double radius) {
		if(radius>0) {
			this.radius = radius;
			area = calculateArea();
			perimeter = calculatePerimeter();
		}
	}
	
	
	@Override
	public double calculateArea() {
		return Math.PI*Math.pow(radius,2); //Math.pow(radius,2); ---> radius*radius
	}

	@Override
	public double calculatePerimeter() {
		return 2*Math.PI*radius;
	}


	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return "Circle [radius=" + radius + ", area=" + df.format(area) + ", perimeter=" + df.format(perimeter)+ "]";
	}

	

}
