package assignments.replit;

public class OOP_224_Person {

	  private String firstName,lastName;
	  private int age;
	  
	  public OOP_224_Person() {		  
		  lastName = "undefined";
		  age=-1;
	  }
	  
	  
	  public OOP_224_Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}


	public String getterFirstName(){
	    return firstName;
	  }
	  public void setterFirstName(String firstName){
	    this.firstName = firstName;
	  }
	  public String getterLastName(){
	    return lastName;
	  }
	  public void setterLastName(String lastName){
	    this.lastName = lastName;
	  }
	  public int getterAge(){
	    return age;
	  }
	  public void setterAge(int age){
	    this.age = age;
	  }
	  public String toString(){
	    return "firstName"+" | "+"lastName"+" | "+"age";
	  }
	  
}
