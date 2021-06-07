package lecture_classes.day10_printing_comments;

public class ForLoop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		///// Task -40
		
		for (int i = 2; i <= 100; i+=2) {
			System.out.print(i + " ");
		}
		
		System.out.println();
		///// Task - 41 
		
		for (int i = 5; i <= 140 ; i+=2) {
			
			System.out.print(i + " ");
			
		}
		
		System.out.println();
		
		///// Task - 41 another way
		
		for(int i = 5 ; i <= 140 ; i++) {
			
			if (i%2 != 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		///// Task - 42 //// False
		int sum = 0 ;
		
		for(int i = 0 ; i < 100 ; i++) {
			
			sum = sum+i;		
				
		}
		
		
		System.out.println("sum is " + sum);
		
		System.out.println();
		///// Task - 42
		
		int sumEvenNumber=0;
		int sumOddNumber=0;
		
		//////////////////////////////////
		
		for(int i = 0 ; i < 100 ; i++) {
			
			if (i%2 == 0) {
				sumEvenNumber = sumEvenNumber+i;
			}else{
				sumOddNumber = sumOddNumber+i;
			}
		
		}
		
		System.out.println("Sum of Even Numbers = "+ sumEvenNumber);
		System.out.println("Sum of Odd Numbers = "+ sumOddNumber);

		System.out.println();
		///// Task - 42
		
		for(int i=0 ; i<=5 ; i++ ){
			
			System.out.println("hey brother!");
			
		}
		
		///////////////////
		System.out.println();
		
		int kare;
		
		for( int i = 1 ; i <=10 ; i++) {
			
			kare = i*i;
			System.out.println(kare);
		}
		
		
		//////////////////////
		
		
		
		
		
		

	}

}
