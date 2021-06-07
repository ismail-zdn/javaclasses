package assignments.Lab3;

public class Question06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(withoutEnd("Hello"));
		

	}
	
	public static String withoutEnd(String word) {
		String mid = word.replace(word.charAt(0), ' ');
		mid = mid.replace(word.charAt(word.length()-1), ' ');
		return mid.trim();
	}

}
