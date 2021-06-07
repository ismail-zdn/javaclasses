package lecture_classes.day33_ClassAndObjects_Constracters;

import java.util.Scanner;

public class BankAccountTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is your starting balance ?");
		
		BankAccount account = new BankAccount(input.next());
		
		System.out.println("How much did you pay this month?");
		
		account.deposit(input.next());
		
		System.out.println("Your pay has been deposited. Your currently balance is "+account.getBalance());
		

	}

}
