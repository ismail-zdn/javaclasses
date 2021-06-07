package lecture_classes.day30_wrapperClass;

public class ParsingValues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = "1994";
		
		int year = Integer.parseInt(word); // parsing to integer
		
		System.out.println(year+26);
		
		double number = Double.parseDouble(word);
		
		System.out.println(number);
		
		int i = 10;
		String s = String.valueOf(i);
		System.out.println(s); // it will return "10"
		
		String s2 = Integer.toString(i);
		System.out.println(s2); // it will return "10"
		
		
		

	}

}
