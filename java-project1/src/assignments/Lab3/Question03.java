package assignments.Lab3;

public class Question03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		extraEnd("ismail");
		extraEnd("Hello");
		extraEnd("ab");
		extraEnd("Hi");
		

	}
	
	public static void extraEnd(String word) {
		
		String end = word.substring(word.length()-2);
		
		System.out.println(end+end+end);
		
	}

}
