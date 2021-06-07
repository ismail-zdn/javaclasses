package lecture_classes.week14Review;

public final class Tester extends Employee{

	public Tester(String name, int age, char gender, String ID, String jobTitle, double hourlyRate,
			boolean isFulltime) {
		super(name, age, gender, ID, jobTitle, hourlyRate, isFulltime);
	}
	
	public void findBug() {
		System.out.println(jobTitle+" "+name+" found a bug.");
	}

	public void testing() {
		System.out.println(jobTitle+" "+name+" is testing the application.");
	}
	
	@Override
	public void work() {
		System.out.println(jobTitle+" "+name+" is creating the application.");
	}
	
	
}
