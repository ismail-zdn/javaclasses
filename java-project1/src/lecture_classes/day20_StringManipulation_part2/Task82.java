package lecture_classes.day20_StringManipulation_part2;
import java.util.Scanner;
public class Task82 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String TrueUserName = "ismail";
		String TruePassword = "100";
		
		login(TrueUserName, TruePassword);
		

	}
	
	public static void login(String TrueUserName, String TruePassword) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter your username: ");
		String userName = input.nextLine();
		System.out.print("Enter your password: ");
		String password = input.nextLine();
		
		if (userName.equals("") && password.equals("")) {
			System.out.println("Username and password fields cannot be empty!");
			login(TrueUserName, TruePassword);
		}else if (userName.equals("") && !password.equals("")) {
			System.out.println("Username cannot be empty!");
			login(TrueUserName, TruePassword);
		}else if (!userName.equals("") && password.equals("")) {
			System.out.println("Password cannot be empty!");
			login(TrueUserName, TruePassword);
		}else if (!userName.equals(TrueUserName) || !password.equals(TruePassword)) {
			System.out.println("Username or password is not valid. Please verify and");
			login(TrueUserName, TruePassword);
		}else if (userName.equals(TrueUserName) && password.equals(TruePassword)) {
			System.out.println("User logged successfully.");
		}
			
		}

}
