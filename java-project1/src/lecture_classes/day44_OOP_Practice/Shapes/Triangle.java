package lecture_classes.day44_OOP_Practice.Shapes;

public class Triangle extends Shape{
	
	public Triangle() {
		type="Triangle";
	}

	@Override
	public void draw() {
		System.out.println("Drawing a triangle");
	}

}
