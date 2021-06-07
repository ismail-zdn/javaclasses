package lecture_classes.day7_controlFlowStatements;

public class smallTasks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1-
		
		int x,y;
		x=0;
		y=20;
		
		if ( y == 20) {
			
			x=5;
		}
		
		System.out.println("x= " + x + " y= " + y);
		
		//2-
		
		int hours=50;
		double payRate=1000;
		
		if(hours > 40 ) {
			payRate=payRate*1.5;
		}
		
		System.out.println("Payrate is " + payRate);
		
		//3
		
		boolean max = true;
		int fee=20;
		
		if(max) {
			fee=50;
		}
		
		System.out.println("Fee is " + fee);
		
		//4
		
		int a = 100;
		int b = 20;
		int c = 30;
		
		if(b==50 || c>=100){
			
			a=20;
			
		}
		
		System.out.println("a= " + a);
		
		//5-
		
		int temp = 75;
		
		if (70<=temp && temp<=80) {
			
			System.out.println("Ideal Temp.");
		}
		
		int n1,n2,n3;
		
		n1=24;
		n2=100;
		n3=100;
		
		if (n1 > n2 && n1 > n3) {
			
			System.out.println("The biggest number is "+ n1);
		}
		
		if (n2 > n1 && n2 > n3) {
			
			System.out.println("The biggest number is "+ n2);
		}
		
		if (n3 > n1 && n3 > n2) {
			
			System.out.println("The biggest number is "+ n3);
		}
		
		int Aa = 29;
		int Bb = 209;
		
		if (Aa==Bb) {
			System.out.println("a and b are equal.");
		}
		if (Aa!=Bb) {
			System.out.println("a and b aren't equal.");
		}
		
		int hour = 10;
		
		if (hour<12) {
			
			System.out.println("Good Morning");
		}
		
		double revenue,price,quantity;
		
		price = 10;
		quantity = 2000;
		revenue = price*quantity;
		
		if (revenue>5000) {
			
			revenue= revenue-revenue*0.1;
			
		}
		System.out.println(revenue);
		
		
		
	}
}
