package lecture_classes.day14_methods;

public class task70 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		displayHighScorePosition("Martin", calculateHighScorePosition(1500));
		displayHighScorePosition("Helen", calculateHighScorePosition(900));
		displayHighScorePosition("Jones", calculateHighScorePosition(400));
		displayHighScorePosition("Mike", calculateHighScorePosition(50));

	}
	
	public static int calculateHighScorePosition(int score) {
		int scorePosition;
		if (score >= 1000) {
			scorePosition=1;
		}else if (score >= 500 && score<1000) {
			scorePosition=2;
		}else if (score >= 100 && score<500) {
			scorePosition=3;
		}else {
			scorePosition=4;
		}
		
		return scorePosition;
	}
	
	public static void displayHighScorePosition(String name , int scorePosition) {
		System.out.println(name+ " managed to get into position "+scorePosition +" on the high score table.");
	}

}
