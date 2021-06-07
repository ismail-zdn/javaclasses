package lecture_classes.week9Review;

import java.util.ArrayList;
import java.util.Arrays;

public class StringsStars {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] str = {"one" , "hi" , "hold", "PopCorn"};
		
		ArrayList<String> s = new ArrayList<>();
		s.addAll(Arrays.asList(str));
		
		ArrayList<String> s2 = new ArrayList<>(Arrays.asList(str));
		
		System.out.println(s);
		System.out.println(s2);
		
		System.out.println(makeStars(s));

	}
	
	public static ArrayList<String> makeStars(ArrayList<String> words){
		
		ArrayList<String> stars = new ArrayList<>();
		
		for (String word : words) {
			
			String eachStar="";
			
			for (int i = 0; i < word.length(); i++) {
				eachStar+="*";
			}
			
			stars.add(eachStar);
			
		}
		
		return stars;
		
	}

}
