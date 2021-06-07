package lecture_classes.week8Review;

import java.util.Arrays;

public class DetermineAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		System.out.println(determineAnagrams("listen", "silent"));

	}
	
	public static boolean determineAnagrams(String firstWord , String anotherWord) {
		
		int[] count = new int[26];
		
		if (firstWord.length() != anotherWord.length()) {
			return false;
		}
				
		for (int i = 0; i < firstWord.length(); i++) {
			
			char one = firstWord.charAt(i);
			char two = anotherWord.charAt(i);
			
			count[one-97] = count[one-97]+1;
			count[two-97] = count[two-97]-1;
			
		}
		
		return Arrays.equals(count, new int[26]);
		
	}

}
