package lecture_classes.day8_controlFlowStatements;

public class ifElseIfElse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int day = 7;
		
		if (day==1) {
			System.out.println("Montag");
		}else if (day==2) {
			System.out.println("Dienstag");
		}else if (day==3) {
			System.out.println("Mittwoch");
		}else if (day==4) {
			System.out.println("Donnerstag");
		}else if (day==5) {
			System.out.println("Fritag");
		}else if (day==6) {
			System.out.println("Samstag");
		}else if (day==7) {
			System.out.println("Sonntag");
		}else {
			System.out.println("It is not a valid day.");
		}
		 ///////
		
		int i= 190;
		int ii = 190;
		int iii = 100;
		
		if (i > ii && i >iii) {
			System.out.println("i is greatest one.");
		}else if (ii > i && ii>iii) {
			System.out.println("ii is greatest one.");
		}else if (iii> i && iii>ii) {
			System.out.println("iii is greatest one.");
		}else {
			System.out.println("some of numbers is equal.");
		}
		
		////////
		
		int a = 50;
		
		if (a<60) {
			System.out.println("Fail.");
		} else if (a>=60 && a<90) {
			System.out.println("Pass.");
		} else if (a>90) {
			System.out.println("Passed with distinction.");
		} else {
			System.out.println("Invalid Score");
		}
		
		//////////////////////////
		
		int n1=10;
		int n2=20;
		int n3=3;
		
		if (n1>n2 && n1>n3) {
			System.out.println("n1 is the biggest one.");
			} else {
				if (n2>n3) {
					System.out.println("n2 is the biggest one.");
				}else {
					System.out.println("n3 is the biggest one.");
				}
			}
		
		/////////////////////////// 
		
		

	}

}
