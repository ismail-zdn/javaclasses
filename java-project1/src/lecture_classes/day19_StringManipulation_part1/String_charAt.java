package lecture_classes.day19_StringManipulation_part1;

public class String_charAt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String name = "ismail özden";
		
		name.charAt(5);
		
		char a = name.charAt(4);
		
		System.out.println(a);
		
		System.out.println(name.length());
		
		System.out.println(name.charAt(9));
		
		String word = "Apple";
		
		if (word.charAt(0)=='A') {
			System.out.println(true);
		}else {
			System.out.println(false);
		}
		
		String word2 = "civic";
		
		char at = word2.charAt(word2.length()-1);
		
		System.out.println(at);
		
		///////////////////////////////////////
		
		String cyber = "CyberTek School";
		
		for (int i = 0; i < cyber.length(); i++) {
			
			System.out.println(cyber.charAt(i));
			
			
			
		}
		
		System.out.println("************************");
		///////////////////////////////////////
			
		String emoji = ";)";
		
		if (emoji.length()!=2) {
			
			System.out.println("invalid emoji!!!");
			return; //Stop Execution
			
		}
		
		char first = emoji.charAt(0);
		char second = emoji.charAt(1);
		
		if (first==':') {
			
			if (second==')') {
				System.out.println("Smile");
			}else if (second=='(') {
				System.out.println("Sad");
			}else if (second=='/') {
				System.out.println("Upset");
			}else {
				System.out.println("Inknown Emoji");
			}
		}else if (first==';') {
			if (second==')') {
				System.out.println("Wink");
			}else if (second=='0') {
				System.out.println("Suprised");
			}else {
				System.out.println("Unkoown emoji");
			}
		}else {
			System.out.println("Invalid Emoji");
		}

		////////////////////////////////////////
		
		String word4 = "abcabcqabc";
		char myChar = 'a';
		int counter = 0;
		
		for (int i = 0; i < word4.length(); i++) {
			if (word4.charAt(i)==myChar) {
				
				counter++;
				
			}
		}
		System.out.println("Count for a "+counter+".");
		
		/////////////////////////////////////
		
		String word5 = "CybertekSchool";
		char wovel = 'a';
		int count = 0;
		
		for (int i = 0; i < word5.length(); i++) {
		
			char letter = word5.charAt(i);
					
					if (letter=='a' || letter=='e' || letter=='o' || letter=='i' || letter == 'u') {
						System.out.print(letter);
						
						if (i != word5.length()-2) {
							System.out.print(",");
						}
					}
			
		}

		}

	}


