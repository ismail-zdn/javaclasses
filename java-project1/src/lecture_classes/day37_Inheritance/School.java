package lecture_classes.day37_Inheritance;

public class School {

	public static void main(String[] args) {


		Person person = new Person();
		Student student = new Student();
		
		person.name="Mike";
		person.gender='M';
		person.age=35;
		
		student.name="Smith";
		student.age=30;
		student.gender='M';
		
		student.studentId=3452;
		
		person.eat("Kopfsalat");
		student.eat("Pizza");
		
		//person.code("Java");

	}

}
