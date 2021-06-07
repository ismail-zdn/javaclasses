package lecture_classes.day35_encapsulation;

public class Person {

	//instance variables
	private String name;
	private int age;
	private char gender;

	public void setAge(int age) {
		//with a setter method you can put conditions
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public char getGender() {
		return gender;
	}

	public void setGender(char gender) {
		this.gender = gender;
	}

	@Override
	public String toString() {
		return "Person [name=" + name + ", age=" + age + ", gender=" + gender + ", getAge()=" + getAge()
				+ ", getName()=" + getName() + ", getGender()=" + getGender() + ", getClass()=" + getClass()
				+ ", hashCode()=" + hashCode() + ", toString()=" + super.toString() + "]";
	}
	
}
