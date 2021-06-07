package lecture_classes.day45_Error_Exception;

public class NullPointer {

	static String name;
	
	public static void main(String[] args) {
		
		try {
			System.out.println(name.toUpperCase());	
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
		
	}
}
