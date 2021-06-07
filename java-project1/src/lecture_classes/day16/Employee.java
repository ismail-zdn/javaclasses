package lecture_classes.day16;

public class Employee {
	
	String name, jobTitle ;
	int salary;
	
	public void work() {
		System.out.println(name +" is working.");
	}
	public void attendMeeting() {
		System.out.println(name +" is attending the meeting.");
	}
	public void introduce() {
		System.out.println("name : "+name +" "+"Job Title: "+jobTitle+" Salary "+ salary);
	}

}
