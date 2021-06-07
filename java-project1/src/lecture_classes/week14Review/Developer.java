package lecture_classes.week14Review;

public final class Developer extends Employee{

	public Developer(String name, int age, char gender, String ID, String jobTitle, double hourlyRate,
			boolean isFulltime) {
		super(name, age, gender, ID, jobTitle, hourlyRate, isFulltime);
	}
	
	public void coding() {
		System.out.println(jobTitle+" "+name+" is coding.");
	}
	
	public void fixingBug() {
		System.out.println(jobTitle+" "+name+" is fixing Bug.");
	}

}
