package lecture_classes.day36_staticClassMembers;

public class Student {
	
	private String name;
	private int age;
	private int idNumber;
	private static String school;
	public Student(String name, int age, int idNumber, String school) {
		this.name = name;
		this.age = age;
		this.idNumber = idNumber;
		this.school = school;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", idNumber=" + idNumber + ", school=" + school + "]";
	}
	public static String getSchool() {
		return school;
	}
	public static void setSchool(String school) {
		Student.school = school;
	}
	
	
	
	

}
