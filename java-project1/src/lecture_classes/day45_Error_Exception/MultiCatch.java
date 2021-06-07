package lecture_classes.day45_Error_Exception;

public class MultiCatch {
	
	public static void main(String[] args) {
		
		try {
			//System.out.println(4/0);
			//String str =null;
			//System.out.println(str.toUpperCase());
			
			int[] n = {10,4};
			System.out.println(n[2]);
			
		} catch (ArithmeticException e) {
			e.printStackTrace();
			System.out.println("Aritmatic");
		}catch (NullPointerException e) {
			e.printStackTrace();
			System.out.println("NullPointer");
		}catch (RuntimeException e) {
			e.printStackTrace();
			System.out.println("Runtime");
		}
		
	}

}
