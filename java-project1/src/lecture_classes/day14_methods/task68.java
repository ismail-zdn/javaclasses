package lecture_classes.day14_methods;

public class task68 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		yearsUntilRetirement("Ismail", 1994);

	}
	
	public static int calculateAge(int yearBirth) {
		return 2020-yearBirth;
	}
	
	public static void yearsUntilRetirement(String name,int yearBirth) {
		 
		int yearsUntilRetirement = 65-calculateAge(yearBirth);
		System.out.println(name+" retires in "+yearsUntilRetirement+" years.");
	}

}
