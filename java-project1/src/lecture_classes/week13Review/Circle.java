package lecture_classes.week13Review;

public class Circle extends Shape{
	
	public double radius,diameter;
	public final static double PI;
	
	static {
		PI = 3.14;
	}

	public Circle(double radius) {
		super("Circle");
		this.radius = radius;
		diameter = 2*radius;
		area = calculateArea();
		perimeter = calculatePerimeter();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "Shape [name=" + name + ", area=" + area + ", perimeter=" + perimeter + ", diameter=" + diameter + "]";
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return radius*radius*PI;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return diameter*PI;
	}
}
