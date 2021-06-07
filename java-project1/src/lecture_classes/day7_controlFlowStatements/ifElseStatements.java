package lecture_classes.day7_controlFlowStatements;

public class ifElseStatements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int score = 60;
		
		if (score>=70) {
			
			System.out.println("You passed!");
			
		}else {
			System.out.println("You failed!");
		}
		
		//1
		
		int x,y;
		x=10;
		if (x>100) {
			y=20;
		}else {
			y=100;
		}
		
		System.out.println("x = "+x + " y= " + y);
		
		//2
		
		if (y==100) {
			x=1;
		} else {
			x=0;
		}
		
		System.out.println("x = "+x + " y= " + y);
		
		//3
		
		int a,b,c;
		a=19;
		if (a<10) {
			b=0;
			c=1;
		} else {
			b=-99;
			c=0;
		}
		
		System.out.println("a = "+a + " b= " + b+ " c= " + c);
		
		
		//Task-29
		
		int num1 = 24;
		int num2 = 5;
		
		
		if (num2>num1) {
			
			System.out.println( num2 + "number is greater than" + num1);
		
		}
		
		else if (num2 == 5) {
			System.out.println("num2 = 5.");
		}
		
		else{
			System.out.println("Num1 is equal Num2");
		}
		
		// Task - 30
		
		int i =0;
		
		if (i%2 == 0) {
			System.out.println("Number i is an even number.");
		} else {
			System.out.println("Number i is an odd number.");

		}
		
		int i1,i2,i3;
		i1= 30;
		i2= 60;
		i3= 90;
		
		if (i1+i2+i3 == 180) {
			
			System.out.println("this triangle is valid.");
			
		} else {
			
			System.out.println("this triangle isn't valid.");

		}
	}

}
