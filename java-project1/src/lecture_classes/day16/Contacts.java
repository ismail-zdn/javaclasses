package lecture_classes.day16;

public class Contacts {
	
	String name,email, phoneNumber;
	
	public void call() {
		System.out.println(name+"is calling...");
	}
	public void sendMessage() {
		System.out.println("Sending message to"+name+" "+phoneNumber);
	}
	public void sendEmail() {
		System.out.println("Sending email to "+email+".....");
	}

}
