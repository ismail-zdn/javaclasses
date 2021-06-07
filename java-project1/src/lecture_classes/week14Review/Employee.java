package lecture_classes.week14Review;

public class Employee extends Person{
	
	
	
	public double hourlyRate;
	public String jobTitle , ID;
	public boolean isFulltime;
	
	public Employee(String name, int age, char gender, String ID, 
			String jobTitle , double hourlyRate , boolean isFulltime) {
		super(name, age, gender);
		this.ID = ID;
		this.jobTitle=jobTitle;
		this.hourlyRate=hourlyRate;
		this.isFulltime=isFulltime;
		
	}
	
	public void work() {
		System.out.println(jobTitle+" "+name+" is working.");
	}
	
	public double calculateSalary() { //40 hours in a week, 52 week in a year for fullTime
		
		if (isFulltime) {
			return hourlyRate*40*52;
		}
		
		return hourlyRate*20*52; //20 hours for part time
		
		
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", age=" + age + ", gender=" + gender
				+ "hourlyRate=" + hourlyRate + ", jobTitle=" + jobTitle + ", ID=" + ID + ", isFulltime="
				+ isFulltime + "Salary="+calculateSalary()+"]";
	}
	
//	public double hebele() {
//		return 5;
//	}
	
	

}
