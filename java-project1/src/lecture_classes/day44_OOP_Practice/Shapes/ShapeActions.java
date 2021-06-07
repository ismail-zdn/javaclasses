package lecture_classes.day44_OOP_Practice.Shapes;

import static lecture_classes.day44_OOP_Practice.Shapes.ShapeManager.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class ShapeActions {

	public static void main(String[] args) {
		
		Square mySquare = new Square();
		
		drawSquare(mySquare);
		
		String type = "square";
		
		drawSquare((Square) buidShape(type)); 
		//buildShape returning Shape shape = new Square();. 
		//Because of that to use drawSquare which belongs Square class we need to cast it because there is no
		// drawSquare method in the Shape class.
		
		Object rand = new Random();
		System.out.println(((Random)rand).nextInt(5));
		
		List<Shape> myList = new ArrayList<>();
		myList.add(new Shape());
		myList.add(new Triangle());
		myList.add(new Shape());
		myList.add(new Square());
		myList.add(new Triangle());
		
		drawShape(myList);
		
		
	}
}
