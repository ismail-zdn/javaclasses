package lecture_classes.day20_StringManipulation_part2;

public class tasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "ali baba bir gece kalmis";
		
		String str2 = "ali";
		
		check(str1, str2);

	}
	
	public static void check(String str1, String str2) {
		if (str1.contains(str2)) {
			System.out.println(str1.indexOf(str2));
		}else {
			System.out.println("not found");
		}
	}

}
