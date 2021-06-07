package lecture_classes.day17_classObjects;

public class CapitalOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BankAccount acc1 = new BankAccount();
		
		acc1.accountHolder="mike";
		
		acc1.accountNumber=1245;
		
		acc1.deposit(250);
		
		acc1.showBalance();
		
		acc1.charge(50, "table");
		
		acc1.showBalance();

	}

}
