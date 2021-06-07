package lecture_classes.day36_staticClassMembers;

public class CountableTest {

	
	public static void main(String[] args) {
		
		int objectCount;
		
		Countable obj1 = new Countable(); //1
		Countable obj2 = new Countable(); //1
		Countable obj3 = new Countable(); //1
		
		objectCount = obj1.getInstanceCount();
		objectCount = obj2.getInstanceCount();
		objectCount = obj3.getInstanceCount();
		
		System.out.println(objectCount);
		System.out.println(Countable.instanceCount ); 
		
	}
}
