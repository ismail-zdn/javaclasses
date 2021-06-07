package assignments.Lab3;

public class Question04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		firstTwo("Hello");
		firstTwo("abcdefg");
		firstTwo("");
		firstTwo("ab");
		

	}
	
	public static void firstTwo(String word) {
		String first ="";
		
		if(word.length()<=2) {
			System.out.println(word);
		}else {
			System.out.println(""+word.charAt(0)+word.charAt(1));
		}
	}

}
