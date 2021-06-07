package lecture_classes.week13Review;

public class Square extends Shape{

	public double side;

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return side*side;
	}

	@Override
	public double calculatePerimeter() {
		// TODO Auto-generated method stub
		return side*4;
	}

	public Square(double side) {
		super("Square");
		this.side = side;
		//name = "Square";
		area = calculateArea();
		perimeter = calculatePerimeter();
	}
	
	

}
