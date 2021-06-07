package lecture_classes.day33_ClassAndObjects_Constracters;

public class StudentTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student student1 = new Student("Mike", 17, 'M', 2016, "Java", "Cybertek Universty");
		Student student2 = new Student("Smith",18, 'M', 2015, "JS", "Cybertek Universty");
		Student student3 = new Student("Mary", 19, 'F', 2017, "TS", "Cybertek Universty");
		
		student1.attendLecture();
		student1.attendLab();
		student1.submitAssignment();
		
		student2.attendLab();
		student3.submitAssignment();
		
		Student student4 = new Student("Hamza", 19, 'M', 2017, "TS");
		student4.attendLab();
		System.out.println(student4.universty);
		
	}

}
