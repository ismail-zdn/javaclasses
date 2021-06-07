package lecture_classes.day39_Inheritance_Review;

public class Vehicle {
	
			private String name;
			private String size;
			private int currentVelocity;
			private int currentDirection;
			public String getName() {
				return name;
			}
			public void setName(String name) {
				this.name = name;
			}
			public String getSize() {
				return size;
			}
			public void setSize(String size) {
				this.size = size;
			}
			public int getCurrentVelocity() {
				return currentVelocity;
			}
			public void setCurrentVelocity(int currentVelocity) {
				this.currentVelocity = currentVelocity;
			}
			public int getCurrentDirection() {
				return currentDirection;
			}
			public void setCurrentDirection(int currentDirection) {
				this.currentDirection = currentDirection;
			}
			public Vehicle(String name, String size, int currentVelocity, int currentDirection) {
				this.name = name;
				this.size = size;
				this.currentVelocity = currentVelocity;
				this.currentDirection = currentDirection;
			}
			public Vehicle(String name, String size) {
				this.name = name;
				this.size = size;
			}
			public Vehicle() {
				this("BMW","2.0",50,20);
			}
			
			public void move(int velocity, int direction) {
				this.currentDirection=direction;
				this.currentVelocity=velocity;
				System.out.println("Vehicle move() Current direction = "+currentDirection +"Current Velocity = "+ currentVelocity);
			}
			
			public void steer(int direction) {
				this.currentDirection += direction;
				System.out.println("Vehicle.steer() Current direction = "+currentDirection);
			}
			
			public void stop() {
				this.currentVelocity=0;
			}
			

}
