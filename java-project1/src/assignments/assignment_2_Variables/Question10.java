package assignments.assignment_2_Variables;

public class Question10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*
		 * 
1. Declare variables: hour, minute, second that can hold int values.
Declare amOrPm variable that can hold a String ("AM" or "PM")

2. An instructor will set different values to your variables

3. Using the variables and concatenation, print values in the format mentioned above. 12:24:33 PM
		 */
		
		int hour = 10; //An instructor will set different values to this variable.
		int minute = 22; //An instructor will set different values to this variable.
		int second= 59; //An instructor will set different values to this variable.
		String amOrPm ="Pm"; //An instructor will set different values (AM - PM) to this variable.
		
		System.out.println(hour+":"+minute+":"+second+" "+amOrPm);

	}

}
