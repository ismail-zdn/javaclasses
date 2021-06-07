package lecture_classes.week6Review;

public class StringInMemory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String s1 = "abc"; //literally
		String s2 = new String("abc"); // using new keyword
		
		String s3 = "abc";
		
		System.out.println(s1==s3); // == compare based on objects. so it is true.
		
		System.out.println(s1==s2); // false because they are different objects.
		
		System.out.println(s1.equals(s2)); // true.
		//because .equals() method compare based on values.not objects.
		
		

	}

	public void talk() {
		System.out.println("Im talking from StringInMemory class.");
	}
}


