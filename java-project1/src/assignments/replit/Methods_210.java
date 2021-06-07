package assignments.replit;

public class Methods_210 {

	  public static void main(String[] args) {
		    
		    String result = reverseLetters("..zxcv..d");
		    System.out.println(result);
		    System.out.println(result.equals("..dvcx..z"));
		    
		    String result2 = reverseLetters("---abmkl.o-");
		    System.out.println(result2);
		    System.out.println(result2.equals("---olkmb.a-"));
		    
		    String result3 = reverseLetters("---abmkl.o-");
		    System.out.println(result3.equals("-o.lkmba---"));
		  }
		  
			  public static String reverseLetters(String text){
				    
				    char[] letters = new char[text.length()];
				    
				    for (int i = 0; i < letters.length; i++) {
				    	
					if ((text.charAt(letters.length-1-i) >= 97 && text.charAt(letters.length-1-i) <= 122) || (text.charAt(letters.length-1-i) >= 65 && text.charAt(letters.length-1-i) <= 90)) {
						
						letters[i] = text.charAt(letters.length-1-i);
						}else{
							letters[i] = text.charAt(i);
							}
					}
					String newWord = "";
				    for (char c : letters) {
						newWord = newWord+c;
					}
					return newWord;
				  }
}
