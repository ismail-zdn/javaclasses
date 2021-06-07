package assignments.replit;

public class Methods_209 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println(extractNum("aa2aa3"));

	}
	
	public static String extractNum(String s) {
	    String result = "";
	   for(int i = 0 ; i < s.length() ; i++){
	    
	     
	     if(Character.isDigit(s.charAt(i))){
	       result += s.charAt(i);
	     }
	     
	   }
	    return result;
	   
	  }

}
