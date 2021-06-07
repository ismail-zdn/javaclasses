package lecture_classes.day38_InheritancePart2;

import javax.swing.text.html.HTMLDocument.HTMLReader.SpecialAction;

public class Animal {
	
	private String name;
	private int brain;
	private int body;
	private int size;
	private int weight;
	private int speed;
	
	public Animal(String name, int brain, int body, int size, int weight, int speed) {
	
		this.name = name;
		this.brain = brain;
		this.body = body;
		this.size = size;
		this.weight = weight;
		this.speed = speed;
	}
	
	public void eat() {
		System.out.println("Anima.eat is called");
	}
	
	public void move(int speed) {
		System.out.println("Animal.move() called. Animal is moving at "+ speed);
	}

	public String getName() {
		return name;
	}


	public int getBrain() {
		return brain;
	}


	public int getBody() {
		return body;
	}


	public int getSize() {
		return size;
	}

	

	public int getWeight() {
		return weight;
	}

	
}
