package lecture_classes.week17;

import lecture_classes.day37_Inheritance.finalExanTest;

public class tryCatchEx {
	
	public static void main(String[] args) {
		String s = "java";
		
		try {
			
			System.out.println(s.charAt(1));
		//	throw new RuntimeException();
			
			Thread.sleep(-10);
			
		}catch (StringIndexOutOfBoundsException e) {
			System.out.println(s.charAt(0));
		}catch (RuntimeException e) {
			System.out.println("exception");
		}catch (InterruptedException e) {
			e.printStackTrace();
			System.out.println("negatif olamaz");
		}
		finally {
			System.out.println("finally");
		}
		
		
	}

}
