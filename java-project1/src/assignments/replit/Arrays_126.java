package assignments.replit;

import java.util.Arrays;
import java.util.Scanner;

public class Arrays_126 {
	public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    String str = scan.nextLine();
	    
	    String[] words = str.split(", ");
	    String shortest = words[0];
	    int count = 0;
	    for(String word : words){
	      if(word.length() <= shortest.length()){
	        shortest = word;
	      }
	    }
	    int shortL = shortest.length();
	    for(int i = 0 ; i < words.length ; i++){
		      
		      if(words[i].length() == shortL){
		        count++;
		      }
		    }
	    
	    
	    String[] shortWords = new String[count];
	    int hebele = 0;
	    
	    for(int i = 0 ; i < words.length ; i++){
	      
	      if(words[i].length() == shortL){
	        shortWords[hebele] = words[i];
	        hebele++;
	      }
	    }
	    
//	    Arrays.sort(shortWords);
	  
	    System.out.println(Arrays.toString(shortWords));
	    
	  }

}
