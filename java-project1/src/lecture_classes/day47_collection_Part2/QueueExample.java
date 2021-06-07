package lecture_classes.day47_collection_Part2;

import java.util.*;

public class QueueExample {
	
	public static void main(String[] args) {
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("Mike");
		queue.add("Ozzy");
		queue.add("Asia");
		queue.add("Jamal");
		
		System.out.println(queue.toString());
		
		String name = queue.remove();
		System.out.println(name);
		
		System.out.println(queue.toString());
		
		//removing an element from Queue using poll()
		//the poll() method is similar to remove except that it returns null if the queue is empty
		name=queue.poll();
		System.out.println(name);
		
		System.out.println(queue.toString());
		
		//get the element at the front of the queue without removing it using peek()
		name=queue.peek();
		System.out.println(name);
		System.out.println(queue.toString());
	}

}
