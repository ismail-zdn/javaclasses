package lecture_classes.day9_controlFlowStatementsPart2;
import java.util.Scanner;
public class SwitchCase {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/////////////////////////// Task - 37
		
		@SuppressWarnings("resource")
		Scanner input = new Scanner(System.in);
		System.out.println("Please write your computer model.");
//		String PcModel = input.nextLine();
		String PcModel = input.nextLine();
//		String PcModel = "Apple";
		switch(PcModel) {
		
		case "Apple":
			System.out.println("Apple - kein virus");
			break;
			
		case "Dell":
			System.out.println("Tough one");
			break;
			
		case "Acer":
			System.out.println("Not recommended");
			break;
			
		default: System.out.println("do not buy that one!");

	}
		
		////////////////////////////////// Task-38
		
		

		int tagNummer = 3;
		
		switch(tagNummer) {
		
		case 1: System.out.println("Montag");
		break;
		case 2: System.out.println("Dienstag");
		break;
		case 3: System.out.println("Mittwoch");
		break;
		case 4: System.out.println("Donnerstag");
		break;
		case 5: System.out.println("Freitag");
		break;
		case 6: System.out.println("Samstag");
		break;
		case 7: System.out.println("Sontag");
		break;
		default: System.out.println("ungültig tagNummer.");
		
		}
		
		
		///////////////////////////////// Task -39
		
		char code = 'r';
		
		switch(code) {
		
//		case 'r' : System.out.println("Red");
//			break;
//		case 'R' : System.out.println("Red");
//			break;
		case 'r' :
		case 'R' :
			System.out.println("Rot");
			break;
			
//		case 'o' : System.out.println("Orange");
//			break;
//		case 'O' : System.out.println("Orange");
//			break;
			
		case 'o' :
		case 'O' :
			System.out.println("Orange");
		break;
			
//		case 'g' : System.out.println("Green");
//			break;
//		case 'G' : System.out.println("Green");
//			break;
		
		case 'g' :
		case 'G' :
			System.out.println("Grün");
			break;
		default : System.out.println("ungültig code");
		
		}

	}

}
