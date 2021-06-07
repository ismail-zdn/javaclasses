package lecture_classes.day33_ClassAndObjects_Constracters;

public class BankAccount {
	double balance;
	public BankAccount() {
		balance = 0.0;
	}
	
	public BankAccount(double startBalance) {
		balance = startBalance;
	}
	
	public BankAccount(String str) {
		
		balance = Double.parseDouble(str);
		
	}
	
	
	public void deposit(String str) {
		balance = balance + Double.parseDouble(str);
	}
	
	public double getBalance () {
		return balance;
	}
}
