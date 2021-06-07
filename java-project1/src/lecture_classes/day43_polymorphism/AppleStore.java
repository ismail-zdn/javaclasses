package lecture_classes.day43_polymorphism;

public class AppleStore {

	public static void main(String[] args) {
		
		AppleDevice mac = new Mac();
		mac.use();
		//mac.code(); //There is no method in AppleDevice. No access info
		
		Mac myMac = new Mac();
		myMac.use();
		myMac.code(); // Just Abstraction not Poly
		
		AppleDevice watch = new AppleWatch();
		watch.use();

	}

}
