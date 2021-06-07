package lecture_classes.day44_OOP_Practice.Shapes;

public class Square extends Shape{

	public Square() {
		type="square";
	}

	@Override
	public void draw() {
		System.out.println("Drawing a square");
	}
	
	public void squareMethod() {
		System.out.println("Square Method");
	}
	
	
}
