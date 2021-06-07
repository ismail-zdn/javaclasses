package lecture_classes.day37_Inheritance;

import java.util.Scanner;

public class finalExanTest{

	public static void main(String[] args) {
		
		System.out.println("Please enter how many question in the exam:");
		Scanner input = new Scanner(System.in);
		int questions = input.nextInt();
		System.out.println("Please enter how many questions missed:");
		FinalExam exam = new FinalExam(questions, input.nextInt());
		input.close();
		System.out.println(exam.getGrade());
		
		
		
	}
	
}
