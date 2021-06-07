package lecture_classes.day39_Inheritance_Review;

public class ToyotaTest {

	public static void main(String[] args) {


		Toyota toyota = new Toyota(36);
		
		toyota.steer(45);
		toyota.accelerate(30);
		toyota.accelerate(20);
		toyota.accelerate(-42);
/*
 * Access Modifiers: - > public, protected, default, private
                  - > variables, constructors, methods can have all
                   4 access modifiers.

    private members are accessible:
    	- only within the defining class

    default members are accessible:
    	- within the defining class
    	- in another class in the same package as the defining class

    protected members are accessible:
    	- within the defining class
    	- in another class in the same package as the defining class
    	- in the derived class defined in any package (through inheritance)
    	- It is used to make sure the class variables are 
    	accessible only to subclasses

    public members are accessible:
    	- within the defining class
    	- in another class in the same package as the defining class
    	- in a class defined in another package
 * */
	}

}
