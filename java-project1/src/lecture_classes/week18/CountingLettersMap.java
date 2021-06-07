package lecture_classes.week18;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class CountingLettersMap {
	
	public static void main(String[] args) {
		
		countLetters("Apple");
		
	}

	public static void countLetters(String str) {
		
		Map<Character, Integer> counter = new LinkedHashMap<>();
		
		for (int i = 0; i < str.length() ; i++) {
			
			char key = str.charAt(i);
			
			//wrapper classes's default value is null because they are object
			
			if (!counter.containsKey(key)) {
				counter.put(key, 0);
			}
			
			counter.put(key, counter.get(key)+1);
			
		}
		
		for (Character eachChar : counter.keySet()) {
			System.out.println(eachChar+" - "+counter.get(eachChar));
		}
		
		
	}
	
	
}
