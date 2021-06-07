package lecture_classes.week13Review;

public class Shape {
	public String name;
	public double area;
	public double perimeter;

	public double calculateArea() {
		return 0;
	}
	
	public double calculatePerimeter() {
		return 0;
	}

	@Override
	public String toString() {
		return "Shape [name=" + name + ", area=" + area + ", perimeter=" + perimeter + "]";
	}

	public Shape(String name) {
		super();
		this.name = name;
	}
	
	
}
