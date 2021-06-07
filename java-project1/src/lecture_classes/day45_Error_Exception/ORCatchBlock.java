package lecture_classes.day45_Error_Exception;

public class ORCatchBlock {

	static String str;
	
	public static void main(String[] args) {
		
		
		
		try {
			System.out.println(str.toUpperCase());
		} catch (IllegalArgumentException | NullPointerException e) {
			e.printStackTrace();
		}
	}
}
