package lecture_classes.day7_controlFlowStatements;

public class ifStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 80;
		
		if (score >= 70) {
			
			System.out.println("You are successful !!!");
		}
		
		
		int sales,bonus;
		double commisionRate,salary;
		
		sales=5000;
		salary = 10000;
		
		if (sales>5000) {
			
			bonus=500;
			commisionRate=1.2;
			
			salary=salary*commisionRate+bonus;
		}
		
		System.out.println("Salary = " + salary);

	}

}
