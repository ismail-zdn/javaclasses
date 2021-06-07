package assignments.Lab3;

public class Question05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		firstHalf("WooHoo");
		firstHalf("HelloThere");
		firstHalf("abcdef");
		
		

	}
	
	public static void firstHalf(String word) {
		System.out.println(word.substring(0,word.length()/2));
	}

}
