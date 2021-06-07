package lecture_classes.day47_collection_Part2;

import java.util.Stack;
import java.util.Vector;

public class StackExample {
	
	public static void main(String[] args) {
		
	
		Stack<Integer> numsStack = new Stack<>();
		
		//creating object
		//regular way Class-Class
		//polymorphic way Parent/Interface - Class
	
		Vector<Integer> numsStack2 = new Stack<>();
		((Stack<Integer>)numsStack2).peek();
		
		numsStack.add(50);
		numsStack.add(50);
		numsStack.add(70);
		numsStack.add(150);
		numsStack.add(70);
		
		System.out.println(numsStack.toString());
	
		//check value on top of stack
		System.out.println(numsStack.peek());
	
		//read value on top of stack then remove it
		numsStack.pop();
		
		System.out.println(numsStack.toString());
	
		System.out.println(numsStack.peek());
		System.out.println(numsStack.get(0));
	}
	
	
}
