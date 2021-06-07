package lecture_classes.day34_constructors_passingObjecttoMethod;

public class DiceTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		final int SIX_SIDES = 6;
		final int TWENTY_SIDES = 20;
		
		Dice d = new Dice(SIX_SIDES);
		Dice c = new Dice(TWENTY_SIDES);
		rollDice(d);
		rollDice(c);

	}
	
	public static void rollDice(Dice d) {
		
		// rolling a 6 sided dice
		// The dice's value : 5
		
		
		
		System.out.println("Rolling a "+ d.getSides() + " sided dice");
		
	//	d.roll();
		
		System.out.println("The dices value: " + d.getValue());
		
	}

}
