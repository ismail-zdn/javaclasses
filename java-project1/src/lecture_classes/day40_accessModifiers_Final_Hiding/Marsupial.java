package lecture_classes.day40_accessModifiers_Final_Hiding;

public class Marsupial {
	
/*
	
	public boolean isBiped() {
		return false;
	}
	
*/
	public static boolean isBiped() {
		return false;
	}
	
	public void getMarsupialDescription(){
		System.out.println("Marsupial walks in the two legs" + isBiped());
	}

}
