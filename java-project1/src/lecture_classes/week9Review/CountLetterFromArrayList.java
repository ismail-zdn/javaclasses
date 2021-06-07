package lecture_classes.week9Review;

import java.util.ArrayList;
import java.util.Arrays;

public class CountLetterFromArrayList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[] names = {"apple", "ape", "anna", "build","aaabbc"};
		
		ArrayList<String> words = new ArrayList<>(Arrays.asList(names));
		
		System.out.println(countLetters(words, 'a'));
		
		System.out.println(Arrays.toString(countLetters2(words, 'a')));

	}
	
	public static int countLetters(ArrayList<String> words, char letter) {
		
		int total = 0 ;
		
		for (String word : words) {
			
			for (char eachLetter : word.toCharArray()) {
				if(eachLetter == letter) {
					total++;
				}
			}
		}
		
		return total;
		
		
		
	}
	
	public static int[] countLetters2(ArrayList<String> words, char letter) {
		
		int[] total = new int[words.size()];
		int index = 0;
		for (String word : words) {
			int count = 0;
			for (char eachLetter : word.toCharArray()) {
				if(eachLetter == letter) {
					count++;
				}
			}
			total[index++] = count;
		}
		
		return total;
		
		
		
	}

}
