package assignments.replit;

import java.util.Scanner;

public class Arrays_120 {
	
	public static void main(String[] args) 
	{
	  Scanner input = new Scanner(System.in);
		String[] words = new String[5];
		for(int i = 0; i < 5;  i++) {
		  
		  words[i] = input.nextLine();
		  
		
		//write your code below
		
	}
		
		String longest = "";
		  for(String word : words){
		    if(word.length() > longest.length()){
		      longest = word;
		    }
		  }
		  System.out.println(longest);
		}
		
	}
