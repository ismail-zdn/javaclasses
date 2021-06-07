package lecture_classes.day44_OOP_Practice.Shapes;

public class ShapeTest {

	public static void main(String[] args) {


		Object shapeObject = new Shape();
		Shape diamond = new Diamond();
		Shape square = new Square();
		Shape triangle = new Triangle();
		
		square.draw();
		diamond.draw();
		triangle.draw();
		
		((Square) square).squareMethod();  //downcasting : cast reference type to object type
		
		
	}

}
