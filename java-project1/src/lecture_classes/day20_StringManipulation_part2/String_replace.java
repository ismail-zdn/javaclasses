package lecture_classes.day20_StringManipulation_part2;

public class String_replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Moscow is a capital of Russia";
		
		str = str.replace("Moscow","Baku").replace("Russia",
				"Azerbaijan");
		
		System.out.println(str);

	}

}
