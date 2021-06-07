package lecture_classes.day40_accessModifiers_Final_Hiding;

public class TestParentChild {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child s = new Child();
		System.out.println("Value of x before inrement "+ s.x );
		
		s.increment();
		
		System.out.println("Value of x after inrement "+ s.x );
		
		Parent p = new Parent();
		System.out.println("Value of x before inrement "+ p.x );
		
		p.increment();
		
		System.out.println("Value of x after inrement "+ p.x );

	}

}
