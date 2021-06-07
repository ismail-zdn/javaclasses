package lecture_classes.day30_wrapperClass;

public class Task96 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "Today weather is sunny and 90 degrees. It is perfect day to practice java.";
		
		toPars(str1);
	}
	
	public static void toPars(String word) {
		
		String[] words = word.split(" ");
		Double number = Double.parseDouble(words[5]);
		
		//(32°F − 32) × 5/9 = 0°C
		
		double celcius = (number-32)*5/9;
		
		System.out.println(number+" degree is equal to "+Math.round(celcius)+" celcius");

		
		
		}
	}
