package lecture_classes.week6Review;
import java.util.*;


public class StringMethodsPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// .length()
		
//		String message = "  Java is Awesome!!";
//		
//		int count = message.length();
//		
//		System.out.println(count);
//		
//		message.toUpperCase();
//		
////		System.out.println(message);
//		
////		It is not working because String is immutable!!!
//		
//		System.out.println(message.toUpperCase());
////		message = message.toUpperCase(); ----reassignment
//		System.out.println(message);
//		
//		System.out.println("the result after trimming\n" + message.trim());
//		
//		String str = "ABc";
//		String str1 = "abc";
//		
//		System.out.println(str.equalsIgnoreCase(str1)); // true
//		
//		System.out.println(str.contains("a")); //false *ABc*
//		
//		System.out.println(str1.contains("a")); // true *abc*
//		
//		System.out.println(str.toLowerCase().contains("a")); // true
//		
//		System.out.println(str.charAt(str.length()-1));
//		
//		String name = "";
//		System.out.println(name.isEmpty());
//		
//		String vorname = null;
//		System.out.println(vorname.isEmpty());
		
		String s2 = "Eu4 is Awesome!!";
		
//		System.out.println(s2.indexOf("A"));
//		System.out.println(s2.indexOf('A'));
//		
//		System.out.println(s2.indexOf("som"));
//		
//		System.out.println(s2.substring(10, 14)); // beginning and ending
//		
//		System.out.println(s2.substring(10));
//		
//		System.out.println(s2.contains(" ")); // there is more than one word or ?
//		
//		System.out.println(s2.indexOf(" ")!=-1); // there is more than one word or ?
		
//		System.out.println(s2.substring(0,s2.indexOf(" "))); // find first word!
		
		String firstWord = s2.substring(0,s2.indexOf(" "));
		
		System.out.println(firstWord);
		
//		String secondWord = s2.substring(s2.indexOf(" ")+1, s2.indexOf(" ", s2.indexOf(" ")+1));
		
		
//		System.out.println(s2.substring(s2.indexOf(" ")+1, s2.indexOf(" ", s2.indexOf(" ")+1))); //find second word!
		
		String secondWord = s2.substring(s2.indexOf(" ")+1, s2.indexOf(" ", s2.indexOf(" ")+1));
		
		System.out.println(secondWord);
		
//		String thirdWord = s2.substring(s2.indexOf(secondWord)+2,s2.indexOf(" ", s2.indexOf(secondWord)+secondWord.length()));
//		
//		System.out.println(thirdWord);
		
		
		
//		System.out.println(s2.isEmpty()); // empty or not.
//		
//		String s3= " ";
//		
//		System.out.println(s3.isBlank()); // returns true
//		
//		System.out.println(s3.isEmpty()); // returns false
//		
//		System.out.println(s2.startsWith("E")); // true
//		
//		System.out.println(s2.startsWith("Eu4")); //true
//		
//		System.out.println(s2.endsWith("some!!")); // true
//		
//		System.out.println(s2.substring(2, 2));
//		
//		System.out.println(s2.indexOf("e", 3));
//		
//		System.out.println(s2.length());
//		
//		System.out.println(s2.substring(14,16));
		
		System.out.println(s2.replace(" ", ""));
		
		s2.toUpperCase();
		
		String education = "High school to more";
		
		System.out.println(education.replace(" ","").toUpperCase());
		
		Scanner input = new Scanner(System.in);
		
		education = input.next();
		
		System.out.println(education.replace(" ", ""));
	

	}

}
