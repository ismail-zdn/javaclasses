package lecture_classes.day45_Error_Exception;

public class TryCatchFinally {
	
	public static void main(String[] args) {
		
		String str = "Selenium";
		
		try {
			System.out.println(str.length());
			System.out.println(str.charAt(100));
		} catch (Exception e) {
			System.out.println("Enter correct index");
			return; //it stops main method. but finally always runs
		}finally {
			System.out.println("finally block");
		}
		
		System.out.println("Bye..");
		
	}

}
