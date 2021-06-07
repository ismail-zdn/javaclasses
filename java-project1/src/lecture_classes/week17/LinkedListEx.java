package lecture_classes.week17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;




public class LinkedListEx {
	
	public static void nefesAlma(LinkedListEx animal) {
		
		System.out.println(animal.toString() + "nefes aliyor.");
	}
		
	

	public static void main(String[] args) {
		
		Dog a1 = new Dog();
	
		
		
		LinkedListEx a2 = new Cat();
		
		//a1.nefesAlma(a1);
		//a2.nefesAlma(a2);
		
		nefesAlma(new Dog());
		nefesAlma(a2);
		
	}
}


class Dog extends LinkedListEx{
	
	public void nefesAlmam() {
		System.out.println("köpek nefes aliyor.");
	}
	
}

class Cat extends LinkedListEx{
	
	public void nefesAlmam() {
		System.out.println("kedi nefes sliyor.");
	}
	
}

