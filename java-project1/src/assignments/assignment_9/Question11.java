package assignments.assignment_9;

public class Question11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*
 * Question-11

We have a message variable already declared and assigned value in this format

Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}

Declare variables: sender, phoneNumber, messageBody

By using String methods: retrieve related information from SMS message string and assign it to those 3 variables and print each variable in a separate line

Sample Output:

Sender: Mike Smith
Phone Number: 202-123-3456
Message body: I love programming and problem solving*/
		
		infoPrint("Sender:<Mike Smith>. From Number:[202-123-3456]. Message:{I love programming and problem solving}");
		
	}
	
	public static void infoPrint(String message) {
		String sender, phoneNumber, messageBody;
		
		sender = message.substring(message.indexOf('<')+1,message.indexOf('>'));
		phoneNumber = message.substring(message.indexOf('[')+1,message.indexOf(']'));
		messageBody = message.substring(message.indexOf('{')+1,message.indexOf('}'));
		
		System.out.println("Sender: "+sender+"\r\n" + 
				"Phone Number: "+phoneNumber+"\r\n" + 
				"Message body: "+messageBody);
	}

}
