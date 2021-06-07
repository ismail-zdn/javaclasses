package lecture_classes.day33_ClassAndObjects_Constracters;

public class Rectangle {


		
		double length;
		double width;

		public Rectangle(double a , double b) {
			
			length = a;
			width = b;
			
		}
		
		public Rectangle() {
			
		}
	
	
	public void getArea() {
		System.out.println(length * width);
	}

}
