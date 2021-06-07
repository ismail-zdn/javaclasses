package lecture_classes.day20_StringManipulation_part2;

public class String_replace2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String sentence = " hey brother whats up";
		
		String noSpace = sentence.replace(" ", "");
		
		System.out.println(noSpace);
		
		String date = "10/10/2020 14:59:36";
		
		timeStamp(date);
		
		

	}
	
	public static String timeStamp(String time) {
		
		time = time.replace("/","").replace(" ", "").replace(":", "");
		
		System.out.println(time);
		
		return time;
	}

}
