package lecture_classes.week9Review;

import java.util.ArrayList;

public class ExtractLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(extractLetters("fadsfFSDahAHAY", false));

	}
	
	
	public static ArrayList<Character> extractLetters(String str, boolean check){
		
		ArrayList<Character> letters = new ArrayList<>();
		
		for (int i = 0; i < str.length(); i++) {
		
			char eachChar = str.charAt(i);
		
		
		if (check) {
			
			if (eachChar >= 'A' && eachChar <= 'Z') {  //recommended
				letters.add(eachChar);
			}
			
			}else {
				if (Character.isLowerCase(eachChar)) {
					letters.add(eachChar);
				}
			
		}
		
	}
		return letters;
		
}

}
