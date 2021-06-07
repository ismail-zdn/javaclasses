package lecture_classes.week8Review;

public class ReverseEachWord {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String word = " Merhabalar, benim adim Ismail! ";
		
		System.out.println(reverseEachWord(word));

	}
	
	public static String reverseEachWord(String str) {
		String[] arr = str.split(" ");
		String reverse = "";
		
		for (String word : arr) {
			String reverseEach = "";
			for (int i = word.length()-1; i >= 0 ; i--) {
				reverseEach = reverseEach+word.charAt(i);
			}
			
			reverse = reverse + reverseEach+ " ";
		}
		
		return reverse.trim();
	}

}
