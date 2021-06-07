package lecture_classes.day43_polymorphism;

public class TestAnimal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a = new Animal();
		Animal b = new Dog();
		Animal c = new Bird();
		
		Animal animal = new Animal();
		animal = new Dog();
		animal = new Bird();

	}

}


class Animal{}

class Dog extends Animal{}

class Bird extends Animal{}