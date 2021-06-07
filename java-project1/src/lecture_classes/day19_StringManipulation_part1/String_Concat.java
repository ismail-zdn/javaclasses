package lecture_classes.day19_StringManipulation_part1;

public class String_Concat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word= "ismail";
		
		String fullname = word.concat(" özden");
		
		System.out.println(fullname);
		
		System.out.println(fullname.concat(" nasilsin"));
		
		System.out.println(fullname);
		
		// it doesnt mean assignment

		System.out.println(fullname.concat("123"));
		
		fullname = word.concat(" hey ").concat("hey hey ");
		
		System.out.println(fullname);

	}

}
