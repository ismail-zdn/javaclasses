package lecture_classes.day33_ClassAndObjects_Constracters;

public class RectangleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		Rectangle R1 = new Rectangle(10.9,56.56);
		
		System.out.println(R1.length);
		System.out.println(R1.width);
		
		Rectangle R2 = new Rectangle();
		
		R2.length = 5.5;
		R2.width = 3.5;
		
		
		
//		R1.length=4.4;
//		R1.width=3.4;
		R1.getArea();
		
		R2.getArea();
		
		
		
		

	}
	


}
