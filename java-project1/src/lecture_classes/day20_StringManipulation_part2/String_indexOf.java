package lecture_classes.day20_StringManipulation_part2;

public class String_indexOf {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "Hello Cybertek";
		
		int a = name.indexOf("Cyb");
		
		System.out.println(a);
		
		System.out.println(name.indexOf("faca"));  // it doesnt exist.

		String url = "www.okta.com";
		
		int i = url.indexOf(".");
		
		System.out.println(i);
		
		System.out.println(url.charAt(i+1));
		
		String title = "Java - Google Search";
		
		System.out.println(title.charAt(title.indexOf('-')-1));
		System.out.println(title.charAt(title.indexOf('-')+1));
		
		String word = " java, c++, pyton , tomcat";
		
		boolean isC = word.contains("c++");
		
		if (isC) {
			System.out.println("There is a c++ in the word");
		}else {
			System.out.println("There is no c++ in the word");
		}
		
		int isCC = word.indexOf("c++");
		
		if (isCC!=-1) {
			System.out.println("There is a c++ in the word");
		}
		
	}

}
