package lecture_classes.day30_wrapperClass;

public class Task97 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s = "((W&e**_lco73me %t%o he!@$,.<l>l";
		
		toHell(s);

	}
	
	public static void toHell(String word) {
		
		String basicWord = "";
		for (int i = 0; i < word.length(); i++) {
			if (Character.isAlphabetic(word.charAt(i)) || Character.toString(word.charAt(i)).equals(" ")) {
				// || word.charAt(i) == ' ';
				basicWord = basicWord+word.charAt(i);
			}
		}
		
		System.out.println(basicWord);
	}

}
