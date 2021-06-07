package lecture_classes.week8Review;

public class LongestString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = {"Banana", "Apfel", "Welt","Auf Wiedersehen"};
		
		System.out.println(findLongestString(words));

	}
	
	public static String findLongestString(String[] words) {
		String longestWord = "";
		
		for( String word : words) {
			if (word.length()>longestWord.length()) {
				longestWord=word;
			}
			
		}
		
		return longestWord;
	}

}
