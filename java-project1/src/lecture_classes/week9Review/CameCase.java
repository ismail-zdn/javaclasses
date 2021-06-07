package lecture_classes.week9Review;

import java.util.ArrayList;
import java.util.Arrays;

public class CameCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] words = {"Wie Heißen Sie?", "Ich Heiße Ismail."};
		
		ArrayList<String> words2 = new ArrayList<>(Arrays.asList(words));
		
		System.out.println(words2	);
		System.out.println(makeCamelCase(words2));

	}
	
	public static ArrayList<String> makeCamelCase(ArrayList<String> words){
		
		ArrayList<String> camelCaseWords = new ArrayList<>();
		
		for (String word : words) {
			
			String[] eachWord = word.toLowerCase().split(" ");
			
			String camelWord = eachWord[0];
			
			for (int i = 1; i < eachWord.length; i++) {
				
				String firstLetter = eachWord[i].substring(0,1).toUpperCase();
				camelWord += firstLetter+eachWord[i].substring(1);
				
			}
			
			camelCaseWords.add(camelWord);
			
		}
		
		return camelCaseWords;
	}

}
