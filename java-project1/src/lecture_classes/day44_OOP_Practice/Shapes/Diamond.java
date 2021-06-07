package lecture_classes.day44_OOP_Practice.Shapes;

public class Diamond extends Shape{

	public Diamond() {
		type = "diamond";
	}

	@Override
	public void draw() {
		System.out.println("Drawing a diamond");
	}
	
	
}
