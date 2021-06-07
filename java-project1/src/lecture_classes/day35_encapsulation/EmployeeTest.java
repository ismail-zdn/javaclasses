package lecture_classes.day35_encapsulation;

public class EmployeeTest {
public static void main(String[] args) {
	Employee e1 = new Employee();
	Employee e2 = new Employee("Mark Jones", 39119);
	Employee e3 = new Employee("Tedd", 91775, "Sales", "Sales Person");
	
	System.out.println(e1.getName() +"|"+e1.getIdNumber()+"|"+e1.getDepartmant()+"|"+e1.getPosition());
	System.out.println(e2.getName() +"|"+e2.getIdNumber()+"|"+e2.getDepartmant()+"|"+e2.getPosition());
	System.out.println(e3.getName() +"|"+e3.getIdNumber()+"|"+e3.getDepartmant()+"|"+e3.getPosition());

	e1.setName("Ismail");
	e1.setIdNumber(186);
	e1.setDepartmant("Development");
	e1.setPosition("Tester");
	
	System.out.println(e1.getName() +"|"+e1.getIdNumber()+"|"+e1.getDepartmant()+"|"+e1.getPosition());
	System.out.println(e1.toString());
}
}
