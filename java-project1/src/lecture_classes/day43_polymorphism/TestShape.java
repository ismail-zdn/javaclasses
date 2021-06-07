package lecture_classes.day43_polymorphism;

public class TestShape {
	
	public static void main(String[] args) {
		
		Shape s1 = new Shape();
		s1.draw();
		
		Shape s2 = new Circle();
		s2.draw();
		s2.hebele(); // There is no overriden method in Circle Class, therefor 
		// .hebele() calling from Shape(parentClass)
		
		//s2.bufalo(); ERROR ---> "The method bufalo() is undefined for the type Shape"
		
		
		
	}

}
