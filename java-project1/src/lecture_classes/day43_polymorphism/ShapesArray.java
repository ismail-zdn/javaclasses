package lecture_classes.day43_polymorphism;

import java.util.ArrayList;
import java.util.List;

public class ShapesArray {

	public static void main(String[] args) {


		Shape[] shapes = new Shape[3];
		
		shapes[0] = new Square(); //polymorphism
		shapes[1] = new Triangle(); //polymorphism
		shapes[2] = new Circle(); //polymorphism
		

		for (Shape shape : shapes) {
			//System.out.println(shape.getClass());
			System.out.println(shape.getClass().getSimpleName());
			shape.draw();
		}
		
		
		List<Shape> shapeList = new ArrayList<>(); //poly: ArrayList implements List
		
		shapeList.add(new Square());
		shapeList.add(new Circle());
		shapeList.add(new Triangle());
		
		System.out.println(shapeList.toString());
		
	}

}
