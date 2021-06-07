package lecture_classes.day34_constructors_passingObjecttoMethod;

public class AppleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Apple a1 = new Apple();
//		System.out.println(a1.color); //red
		a1.printColor();
		changeApple(a1);
//		System.out.println(a1.color); // white
		methodObject(); // holds object.
		
		String org = "Orange";
		methodObject().color = org;
		System.out.println(methodObject().color);
		methodObject().printColor();

	}
	
	public static void changeApple(Apple a1) {
		// color = "white"; its a instance variable you couldnt change it like that
		a1.color="white";
		a1.printColor();
		
	}
	
	public static Apple methodObject() {
		
		Apple b1 = new Apple();
		return b1;
		
	}

}
