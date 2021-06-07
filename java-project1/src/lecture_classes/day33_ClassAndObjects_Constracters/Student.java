package lecture_classes.day33_ClassAndObjects_Constracters;

public class Student {

	String name;
	int age;
	char gender;
	int year;
	String course;
	String universty = "Harran Universty";
	/**
	 * @param name
	 * @param age
	 * @param gender
	 * @param year
	 * @param course
	 * @param universty
	 */
	public Student(String name, int age, char gender, int year, String course, String universty) {
		
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
		this.universty = universty;
	}
	
	
	
	/**
	 * @param name
	 * @param age
	 * @param gender
	 * @param year
	 * @param course
	 */
	public Student(String name, int age, char gender, int year, String course) {
		super();
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.year = year;
		this.course = course;
	}



	public void attendLecture() {
		System.out.println(name + " is attending lecture");
	}
	public void submitAssignment() {
		System.out.println(name + " is submitting assignment");
	}
	public void attendLab() {
		System.out.println(name + " is attending lab.");
	}
	
	
	
}
