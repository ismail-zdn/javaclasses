package lecture_classes.day8_controlFlowStatements;

public class switchCaseStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String weather ="windy";
		
		switch (weather) {
		
		case "sunny":
			
			System.out.println("sunny");
			break;
			
		case "windy":
			
			System.out.println("windy");
			//break;
			
		default : 
			
			System.out.println("default");
		
		}
		
		///////////////////////////////////////
		
		int a=0;
		int b=1;
		int result=0;
		String Calc = "-";
		
		switch (Calc) {
		case "+":
			result = a+b;
			break;
			
		case "-": 
			result=a-b;
			break;

		default:
			System.out.println("invalid operator.");
			break;
		}
				
		System.out.println(result);
		
		
		///////// Task-38
		
		

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
		default: System.out.println("invalid tagNummer.");
		
		}
		
		
		/////////////////////////// Task - 37
		
		String PcModel = "Apple";
		
		switch(PcModel) {
		
		case "Apple":
			System.out.println("Apple - no virus");
			break;
			
		case "Dell":
			System.out.println("Tough one");
			break;
			
		case "Acer":
			System.out.println("Not recommended");
			break;
			
		default: System.out.println("do not that one!");

	}
		///////////////////////////////// Task -39
		
		char code = 'g';
		
		switch(code) {
		
		case 'r' : System.out.println("Red");
		break;
		case 'R' : System.out.println("Red");
		break;
		case 'o' : System.out.println("Orange");
		break;
		case 'O' : System.out.println("Orange");
		break;
		case 'g' : System.out.println("Green");
		break;
		case 'G' : System.out.println("Green");
		break;
		default : System.out.println("invalid code");
		
		}
		
		/////////////////////////////////
	}

}
