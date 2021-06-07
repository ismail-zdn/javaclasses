package lecture_classes.week13Review;

public class Rectangle extends Shape {

		public double length,width;
		
		public Rectangle(double length, double width) {
			super("Rectangle");
			this.length = length;
			this.width = width;
			//name = "Rectangle";
			area = calculateArea();
			perimeter = calculatePerimeter();
		}
		
		@Override
		public double calculateArea() {
			return width*length;
		}
		
		@Override
		public double calculatePerimeter() {
			return 2*(width+length);
		}

		
	

}
