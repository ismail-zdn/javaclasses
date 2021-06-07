package lecture_classes.day35_encapsulation;

public class Employee {

	private String name ;
	private int idNumber;
	private String departmant;
	private String position;
	
	public Employee() {
		name="";
		idNumber=0;
		departmant="";
		position="";
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", idNumber=" + idNumber + ", departmant=" + departmant + ", position="
				+ position + "]";
	}

	public Employee(String name, int idNumber, String departmant, String position) {
		this.name = name;
		this.idNumber = idNumber;
		this.departmant = departmant;
		this.position = position;
	}

	public Employee(String name, int idNumber) {
		this.name = name;
		this.idNumber = idNumber;
		departmant="";
		position="";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdNumber() {
		return idNumber;
	}

	public void setIdNumber(int idNumber) {
		this.idNumber = idNumber;
	}

	public String getDepartmant() {
		return departmant;
	}

	public void setDepartmant(String departmant) {
		this.departmant = departmant;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
	
	
	
	
}
