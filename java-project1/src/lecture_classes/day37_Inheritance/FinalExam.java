package lecture_classes.day37_Inheritance;

public class FinalExam extends GradeActvity {

	private int numQuestions;
	private double pointEach;
	private int numissed;
	
	public FinalExam(int numQuestions , int numMissed) {
		
		double numericScore;
		
		this.numQuestions=numQuestions;
		this.numissed=numMissed;
		
		pointEach = 100.0 / numQuestions;
		numericScore = 100.0 - (numMissed*pointEach);
		
		setScore(numericScore);
		
	}
	
}
