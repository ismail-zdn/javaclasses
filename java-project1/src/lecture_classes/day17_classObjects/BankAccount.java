package lecture_classes.day17_classObjects;

public class BankAccount {
	
	double balance;
	String accountHolder;
	int accountNumber;
	
	public void deposit(double amount) {
		System.out.println("depositing $"+ amount+" to "+accountNumber);
		balance+=amount;
	}
	
	public void showBalance() {
		System.out.println("accountHolder"+accountHolder);
		System.out.println("account balance :"+balance);
	}
	
	public void charge (double price,String item) {
		if (balance>=price) {
			System.out.println("buying "+item+" for $"+price);
			balance-=price;
		}else {
			System.out.println("insufficiant funds to purchase"+item+"from"+accountNumber);
		}
	}

}
