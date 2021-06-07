package lecture_classes.week14Review;

import java.util.Arrays;

public class AppleInc {

	public static void main(String[] args) {
		
		Tester tester1 = new Tester("Ali",28,'M',"A01","QA",55,true);
		Tester tester2 = new Tester("Joseph",28,'M',"A02","SDET",40,true);
		Tester tester3 = new Tester("Serkan",28,'M',"A03","QA",30,true);
//		Tester tester4 = new Tester("VEli", 85, 'M', ID, jobTitle, hourlyRate, isFulltime)
		
		Tester[] testers = {tester2,tester3};
		
		
		Developer developer1 = new Developer("Eren",29,'M',"B01","Java Developer",20,false);
		Developer developer2 = new Developer("Zeynep",29,'F',"B02","Software Developer",15,false);
		Developer developer3 = new Developer("Safiye",29,'F',"B03","Java Developer",46,false);
		Developer developer4 = new Developer("Nurullah",29,'M',"B04","Junior Developer",34,false);
		
		Developer[] developers = {developer2,developer3,developer4};
		
		ScrumTeam scrum1 = new ScrumTeam("Yakup", "Ilyas", "Baky");
		scrum1.hireTester(tester1);
		scrum1.hireTester(testers);
		scrum1.hireDeveloper(developer1);
		scrum1.hireDeveloper(developers);
		System.out.println(scrum1);
		
		
		System.out.println("----------------------");
		double budget=0;
		
		for (Developer developer : scrum1.developers) {
			System.out.println(developer.name+" : "+developer.calculateSalary());
			budget+=developer.calculateSalary();
		}
		
		System.out.println("----------------------");
		
		for (Tester tester : scrum1.testers) {
			System.out.println(tester.name+" : "+tester.calculateSalary());
			budget+=tester.calculateSalary();
		}
		System.out.println("----------------------");
		System.out.println("Budget : "+budget);
		
		ScrumTeam scrum2 = new ScrumTeam("Veli", "Kasim", "Sami");
		ScrumTeam scrum3 = new ScrumTeam("Ahmet", "Asya", "Juhanna");
		
		ScrumTeam[] scrums = {scrum1,scrum2,scrum3};
		
		for (ScrumTeam scrumTeam : scrums) {
			System.out.println(scrumTeam);
		}
		
		System.out.println("----------------------");
		
		System.out.println(scrum1);
		scrum1.terminateTester("A01");
		scrum1.terminateDeveloper("B03");
		System.out.println(scrum1);
	}

}
