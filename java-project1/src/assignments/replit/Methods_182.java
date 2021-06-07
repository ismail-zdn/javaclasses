package assignments.replit;

public class Methods_182 {
	
	  public static String clean(String text ,String badWord) {

		  while(text.contains(badWord)){
		    text = text.replace(text.substring(text.indexOf(badWord),text.indexOf(badWord)+badWord.length()),"");
		  }
		      return text;
		  }
	  
	  
	  public static void main(String[] args) {
		
		  System.out.println(clean("zzz bla 88 bla kkk", "bla"));
		  
//		 String text = "zzz bla bla kk";
//		 String badWord = "bla";
//		 
//		 System.out.println(text.contains(badWord));
//		 
//		 System.out.println(text.indexOf(badWord));
//		 
//		 System.out.println(text.indexOf(badWord)+badWord.length());
	}
	
	  

}
