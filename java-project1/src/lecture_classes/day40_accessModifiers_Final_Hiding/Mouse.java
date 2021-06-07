package lecture_classes.day40_accessModifiers_Final_Hiding;

public class Mouse extends Rodent {

	protected int tailLength = 8;
	
	public void getMouseDetails() {
		System.out.println("tail: "+ tailLength + ", parentTail: "+super.tailLength);
	}
}
