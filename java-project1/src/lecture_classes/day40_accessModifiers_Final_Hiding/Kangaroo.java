package lecture_classes.day40_accessModifiers_Final_Hiding;

public class Kangaroo extends Marsupial {

/*	
	
	@Override
	public boolean isBiped() {
		return true;
	}
	
*/
	// Method Hiding
	public static boolean isBiped() {
		return true;
	}
	
	public void getKangarooDescription() {
		System.out.println("Kangaroo hops on two legs "+ isBiped());
	}
	
}
