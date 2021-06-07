package lecture_classes.day20_StringManipulation_part2;

public class String_Equals {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "Welcome to Java";
		String s2 = "Welcome to Java";
		String s3 = "c++";
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		String s4 = new String("Welcome to Java");
		
		
		System.out.println(s1.equals(s4)); //true
		System.out.println(s1==s4); // false
		System.out.println(s1==s2); // true

	}

}
